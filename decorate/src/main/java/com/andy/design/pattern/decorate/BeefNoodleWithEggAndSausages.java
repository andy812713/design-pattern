package com.andy.design.pattern.decorate;

/**
 * <p></p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 10:32
 */
public class BeefNoodleWithEggAndSausages extends Noodle{

    private Noodle noodle;

    public BeefNoodleWithEggAndSausages(Noodle noodle){
        this.noodle = noodle;
    }

    @Override
    public int cost() {
        return this.noodle.cost() + 3;
    }

    @Override
    public String name() {
        return this.noodle.name() +"+1根香肠";
    }
}
