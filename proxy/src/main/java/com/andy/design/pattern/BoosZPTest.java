package com.andy.design.pattern;

import com.andy.design.pattern.domain.Driver;
import com.andy.design.pattern.domain.MsWang;
import com.andy.design.pattern.domain.Person;


public class BoosZPTest {


    public  static void main(String[] args){
        try {
            Person xw = (Person) new BoosZP().getInstance(new MsWang());
            xw.findJob();


            Driver xw1 = (Driver) new BoosZP().getInstance(new MsWang());
            xw1.drive("小汽车");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
