package com.andy.design.pattern.domain;

/**
 * wang先生
 */
public class MsWang implements Person,Driver{

    @Override
    public void findJob() {
        System.out.println("找工作，薪水高，加班不多就行");
    }

    @Override
    public int drive(String car) {
         System.out.println("会开车：" + car);
         return 0;
    }
}
