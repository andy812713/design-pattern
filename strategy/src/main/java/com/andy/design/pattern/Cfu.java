package com.andy.design.pattern;

public class Cfu extends Payment{
    @Override
    public String getType() {
        return "财付通";
    }

    @Override
    public double queryBalance(String uid) {
        return 0;
    }
}
