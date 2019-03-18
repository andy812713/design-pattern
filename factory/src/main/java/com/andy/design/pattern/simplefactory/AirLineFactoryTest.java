package com.andy.design.pattern.simplefactory;

import com.andy.design.pattern.GuohangAirLine;
import com.andy.design.pattern.ShandongAirLine;

public class AirLineFactoryTest {
    public static void main(String[] args) {
        AirLineFactory factory = new AirLineFactory();
        try {
            factory.createAirLine(GuohangAirLine.class).fly();//中国国航起飞
            factory.createAirLine(ShandongAirLine.class).fly(); //山东航空起飞
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
