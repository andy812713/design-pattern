package com.andy.design.pattern;

/**
 * <p>胡萝卜炒肉</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 19:21
 */
public class FriedMeatWithCarrot extends Cook{

    public FriedMeatWithCarrot(String name){
        super(name);
    }

    @Override
    public void stirFry() {
        System.out.println("先放入肉片，一会在放入胡萝卜，炒个3分钟");
    }

    @Override
    public void cut() {
        System.out.println("胡萝卜切成片");
    }
}
