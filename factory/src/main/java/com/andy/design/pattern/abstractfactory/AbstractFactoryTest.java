 package com.andy.design.pattern.abstractfactory;

 
public class AbstractFactoryTest {
    
    public static void main(String[] args) {
        IPcFactory pcFactory = new LenovoPcFactory();
        pcFactory.createCpu().cal();
        pcFactory.createMouse().move();
        
        pcFactory = new HpPcFactory();
        pcFactory.createCpu().cal();
        pcFactory.createMouse().move();
    }
    
}
