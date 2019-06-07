package com.andy.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>观察者角色</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 12:40
 */
public class SubScriber implements Observer {

    private String name;

    public SubScriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("你好！" + name + ", 新闻专栏更新啦！" + arg);
    }


    @Override
    public String toString() {
        return "订阅者： " + name;
    }
}

