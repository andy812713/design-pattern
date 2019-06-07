package com.andy.design.pattern.observer;

/**
 * <p></p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 12:45
 */
public class ObserverTest {

    public static void main(String[] args) {
        NewsColumn newsColumn = new NewsColumn();

        SubScriber subScriberAndy = new SubScriber("Andy");
        SubScriber subScriberTim = new SubScriber("Tim");

        //被观察者加入观察者
        newsColumn.addObserver(subScriberAndy);
        newsColumn.addObserver(subScriberTim);


        newsColumn.postNews("5G中国第一");
    }
}
