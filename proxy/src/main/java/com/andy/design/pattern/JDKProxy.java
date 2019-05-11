package com.andy.design.pattern;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 仿照jdk动态代理
 */
public class JDKProxy {

    /**
     * 定义换行
     */
    private static final String LN = "\r\n";

    private static final String PROXY_NAME = "$Proxy";

    private static final String JAVA_FILE_SUFFIX = ".java";

    public static Object newProxyInstance(JDKClassLoader classLoader, Class<?>[] interfaces, JDKInvocationHandler h) {
        try {
            //动态生成源代码.java文件
            String src = generateSrc(interfaces);

            File f = generateFile(src);

            //把生成的.java文件编译成.class文件
            compileFileToClass(f);

            //编译生成的.class文件加载到JVM中来
            Class<Object> proxyClass = (Class<Object>) classLoader.findClass(PROXY_NAME + "0");
            Constructor<Object> c = proxyClass.getConstructor(JDKInvocationHandler.class);
            f.deleteOnExit();

            //返回字节码重组以后的新的代理对象
            return c.newInstance(h);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void compileFileToClass(File f) throws IOException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manage.getJavaFileObjects(f);

        JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
        task.call();
        manage.close();
    }

    /**
     * Java文件输出磁盘
     */
    private static File generateFile(String src) throws IOException {
        String filePath = JDKProxy.class.getResource("").getPath();
        System.out.println(filePath);
        File f = new File(filePath + PROXY_NAME + "0" + JAVA_FILE_SUFFIX);
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();
        return f;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.andy.design.pattern;" + LN)
                .append("import com.andy.design.pattern.domain.Person;" + LN)
                .append("import com.andy.design.pattern.JDKInvocationHandler;" + LN)
                .append("import java.lang.reflect.Method;" + LN)
                .append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + LN)
                .append("JDKInvocationHandler h;" + LN)
                .append("public $Proxy0(JDKInvocationHandler h) { " + LN)
                .append("this.h = h;")
                .append("}" + LN);
        //只考虑一个接口
        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + LN)
                    .append("try{" + LN)
                    .append("   Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + LN)
                    .append("   this.h.invoke(this, m, null);" + LN)
                    .append(" } catch(Throwable e){ " + LN)
                    .append("    e.printStackTrace();" + LN)
                    .append(" }")
                    .append("}");
        }
        sb.append("}" + LN);
        return sb.toString();
    }
}
