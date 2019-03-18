 package com.andy.design.pattern.abstractfactory;

 
public class HpPcFactory implements IPcFactory{

    public ICpu createCpu() {
        return new LenovoCpu();
   }

   public IMouse createMouse() {
        return new LenovoMouse();
   }
}