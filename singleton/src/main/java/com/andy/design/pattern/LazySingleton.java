package com.andy.design.pattern;

/**
 * 懒加载，用到时在new，存在线程安全问题
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}
    public static LazySingleton getInstance() {
        if(null == instance){ //此处存在线程安全问题
            instance = new LazySingleton();
        }
        return instance;
    }
}
