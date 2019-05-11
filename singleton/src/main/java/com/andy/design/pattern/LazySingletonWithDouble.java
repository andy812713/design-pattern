package com.andy.design.pattern;

/**
 * 懒加载
 */
public class LazySingletonWithDouble {

    private static LazySingletonWithDouble instance = null;

    private LazySingletonWithDouble(){}

    public static LazySingletonWithDouble getInstance() {

        if(null == instance){ //第一重检查
            synchronized (LazySingletonWithDouble.class){
                if(null == instance){  //第二重
                    instance = new LazySingletonWithDouble();
                }
            }
        }
        return instance;
    }
}
