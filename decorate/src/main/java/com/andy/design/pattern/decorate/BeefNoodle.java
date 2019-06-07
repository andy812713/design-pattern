package com.andy.design.pattern.decorate;

/**
 * <p></p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 10:27
 */
public class BeefNoodle extends Noodle{
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String name() {
        return "牛肉面";
    }
}
