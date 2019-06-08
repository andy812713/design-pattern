package com.andy.design.pattern;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 仿照jdk动态代理
 */
public class JDKProxy {

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

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
        StandardJavaFileManager manage = compiler.getStandardFileManager(null,
                null, null);
        Iterable iterable = manage.getJavaFileObjects(f);

        JavaCompiler.CompilationTask task = compiler.getTask(null, manage,
                null, null, null, iterable);
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
        sb.append("package com.andy.design.pattern;" + LN);
        for(int i= 0, len = interfaces.length; i< len; i++){
            sb.append("import "+ interfaces[i].getName() +";" + LN);
        }

               sb.append("import com.andy.design.pattern.JDKInvocationHandler;" + LN)
                .append("import java.lang.reflect.Method;" + LN);
        sb.append("public class $Proxy0 implements ");// + interfaces[0].getName() + "{" + LN);
        for(int i= 0, len = interfaces.length; i< len; i++){
            sb.append(interfaces[i].getName());
            sb.append((i != len-1)? ",":"");
        }
 sb.append("{" + LN);

                sb.append("JDKInvocationHandler h;" + LN)
                .append("public $Proxy0(JDKInvocationHandler h) { " + LN)
                .append("this.h = h;")
                .append("}" + LN);
        for(int i= 0, len = interfaces.length; i< len; i++){
            for (Method m : interfaces[i].getMethods()) {
                //参数类型
                Class<?>[] params = m.getParameterTypes();
                //参数名
                StringBuffer paramNames = new StringBuffer();
                //参数值
                StringBuffer paramValues= new StringBuffer();

                StringBuffer paramClasses = new StringBuffer();

                for(int j =0,leng =params.length; j<leng; j++){
                    Class clazz = params[j];
                    String type = clazz.getName();
                    String paramName = toLowerFirstCase(clazz.getSimpleName());
                    paramNames.append(type + " " +  paramName);
                    paramValues.append(paramName);
                    paramClasses.append(clazz.getName() + ".class");
                    if(j != leng-1){
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }


                sb.append("public " + m.getReturnType().getName()
                        + " " + m.getName() + "(" + paramNames.toString() +") {" + LN)
                        .append("try{" + LN)
                        .append("   Method m = " + interfaces[i].getName()
                                + ".class.getMethod(\"" + m.getName()
                                + "\",new Class[]{"+paramClasses.toString()+"});" + LN)
                        .append((hasReturnValue(m.getReturnType()) ? "return " : "") +
                                getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + LN)
                        .append(" } catch(Throwable e){ " + LN)
                        .append("    e.printStackTrace();" + LN)
                        .append(" }")
                        .append(getReturnEmptyCode(m.getReturnType()))
                        .append("}");
            }
            sb.append(LN);
        }
        sb.append("}" + LN);
        return sb.toString();
    }


    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }
}
