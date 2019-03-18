package com.andy.design.pattern.abstractfactory;


public class LenovoPcFactory implements IPcFactory{

    public ICpu createCpu() {
        return new LenovoCpu();
   }

   public IMouse createMouse() {
        return new LenovoMouse();
   }
}