package com.andy.design.pattern;

import com.andy.design.pattern.JDKClassLoader;
import com.andy.design.pattern.JDKInvocationHandler;
import com.andy.design.pattern.JDKProxy;

import java.lang.reflect.Method;

public class BoosZP implements JDKInvocationHandler{

    private Object targer;

    public Object getInstance(Object target){
        this.targer = target;
        Class<?> clazz = target.getClass();
        return JDKProxy.newProxyInstance(new JDKClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("帮职员找工作");

        //Object obj = method.invoke(proxy, args);//陷入死循环

        Object obj = method.invoke(this.targer, args);
        System.out.println(this.targer + "---我本人先看看工作");
        return obj;
    }
}
