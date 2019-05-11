package com.andy.design.pattern;


import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void deepCloneTest() throws CloneNotSupportedException, InterruptedException {

        Sunwukong sunwukong = new Sunwukong();
        sunwukong.setAge("1000000");
        sunwukong.setName("QiTianDaSheng");

        GoldenCudgel gol = new GoldenCudgel();
        gol.setHeight("10000");
        gol.setWidth("100");
        gol.setCreateDate(11L);
        sunwukong.setGoldenCudgel(gol);
        System.out.println("sunwukong===" +sunwukong.toString());

        TimeUnit.SECONDS.sleep(3);

        Sunwukong cloneMonkey = (Sunwukong) sunwukong.clone();
        System.out.println("cloneMonkey===" +cloneMonkey.toString());



        System.out.println(sunwukong == cloneMonkey);
        System.out.println(sunwukong.getGoldenCudgel() == cloneMonkey.getGoldenCudgel());

    }
}
