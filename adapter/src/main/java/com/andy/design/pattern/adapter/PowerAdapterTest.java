package com.andy.design.pattern.adapter;

/**
 * <p></p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 11:22
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outoUpDC5V();
    }
}
