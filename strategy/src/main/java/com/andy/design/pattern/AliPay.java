package com.andy.design.pattern;

public class AliPay extends Payment{
    @Override
    public String getType() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 40000;
    }
}
