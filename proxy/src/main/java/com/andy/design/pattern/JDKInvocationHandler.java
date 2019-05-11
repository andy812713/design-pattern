package com.andy.design.pattern;

import java.lang.reflect.Method;

public interface JDKInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
