package com.andy.design.pattern.adapter;

/**
 * <p>将220V转成5V</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/7 0007 11:18
 */
public class PowerAdapter implements DC5{

    /**转换源*/
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outoUpDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
