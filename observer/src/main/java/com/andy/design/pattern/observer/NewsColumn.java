package com.andy.design.pattern.observer;

import java.util.Observable;

/**
 * <p>被观察者</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 12:43
 */
public class NewsColumn extends Observable {

    public void postNews(String content){
        //设置标志位为true，表示有新内容
        setChanged();
        //通知所有观察者（即订阅了这新闻的人们）
        notifyObservers(content);
    }
}
