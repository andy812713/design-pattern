package com.andy.design.pattern.adapter;

/**
 * <p>交流电220V</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 11:17
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
