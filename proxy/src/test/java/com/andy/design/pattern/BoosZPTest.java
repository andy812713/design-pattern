package com.andy.design.pattern;

import com.andy.design.pattern.domain.MsWang;
import com.andy.design.pattern.domain.Person;
import org.junit.Test;

public class BoosZPTest {

    @Test
    public void jobTest(){
        try {
            Person xw = (Person) new BoosZP().getInstance(new MsWang());
            xw.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
