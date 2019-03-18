 package com.andy.design.pattern.abstractfactory;

/**
 * 新增一个生产线，多一个工厂
 * 产品族难扩展，产品等级易扩展
 * 
 * 
 * 不符合开闭原则
 * 客户端不依赖产品类实例
 * 
 * 
 * 
 * 产品族         |        产品结构   
 * -------|------------              
 * 海尔              |       冰箱、洗衣机、热水器、空调
 *  美的             |       冰箱、洗衣机、热水器、空调
 * @author Administrator
 * @date 2019年3月11日
 */
public interface IPcFactory {
    ICpu createCpu();
    
    IMouse createMouse();
}
