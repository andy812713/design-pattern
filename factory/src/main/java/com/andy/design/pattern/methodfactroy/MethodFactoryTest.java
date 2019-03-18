 package com.andy.design.pattern.methodfactroy;

public class MethodFactoryTest {
    public static void main(String[] args) {
        IAirLineFactory airLineFactory = new ShandongAirLineFactory();
        airLineFactory.createAirLine().fly();  //山东航空起飞
    }
    
}
