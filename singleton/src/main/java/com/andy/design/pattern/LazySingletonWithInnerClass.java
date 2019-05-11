package com.andy.design.pattern;

/**
 * 懒加载
 */
public class LazySingletonWithInnerClass {

    /**内部类延迟加载*/
    private static class Holder {
        private static LazySingletonWithInnerClass instance = new LazySingletonWithInnerClass();
    }

    private LazySingletonWithInnerClass(){}

    public static LazySingletonWithInnerClass getInstance() {
        return Holder.instance;
    }
}
