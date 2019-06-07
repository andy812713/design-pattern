package com.andy.design.pattern.decorate;

/**
 * <p>测试类</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 10:33
 */
public class DecorateTest {

    public static void main(String[] args) {
        Noodle beef = new BeefNoodle();
        System.out.println("BeefNoodle = [" + beef.name() + ",价格" + beef.cost() + "]");

        Noodle beefWithEgg = new BeefNoodleWithEgg(beef);
        System.out.println("BeefNoodleWithEgg = [" + beefWithEgg.name()
                + ",价格" + beefWithEgg.cost() + "]");

        Noodle beefWithSausages = new BeefNoodleWithEggAndSausages(beefWithEgg);
        System.out.println("BeefNoodleWithEgg = [" + beefWithSausages.name()
                + ",价格" + beefWithSausages.cost() + "]");
    }
}
