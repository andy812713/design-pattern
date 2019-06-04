package com.andy.design.pattern;

/**
 * <p></p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 19:35
 */
public class CookTest {

    public static void main(String[] args) {
        Cook tomato = new StiredEggAndTomato("西红柿炒鸡蛋");
        tomato.doCook();

        Cook carrot = new FriedMeatWithCarrot("胡萝卜炒肉");
        carrot.doCook();
    }
}
