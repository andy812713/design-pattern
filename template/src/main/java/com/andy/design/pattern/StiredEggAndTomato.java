package com.andy.design.pattern;

/**
 * <p>西红柿炒鸡蛋</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 19:21
 */
public class StiredEggAndTomato extends Cook{

    public StiredEggAndTomato(String name){
        super(name);
    }

    @Override
    public void stirFry() {
        System.out.println("放入西红柿和鸡蛋，一起炒");
    }

    @Override
    public void cut() {
        System.out.println("将西红柿切成块，鸡蛋打成汁");
    }
}
