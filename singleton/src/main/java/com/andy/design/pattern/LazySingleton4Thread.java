package com.andy.design.pattern;

/**
 * 懒加载
 */
public class LazySingleton4Thread {

    private static LazySingleton4Thread instance = null;

    private LazySingleton4Thread(){}

    /**
     * 通过synchronized同步方法，保证线程安全
     * @return
     */
    public static synchronized LazySingleton4Thread getInstance() {
       if(null == instance){
            instance = new LazySingleton4Thread();
        }
        return instance;
    }
}
