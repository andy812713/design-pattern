package com.andy.design.pattern;

/**
 * 饿汉式，本身就线程安全
 */
public class HungrySingleton {

    /**先new一个*/
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

}
