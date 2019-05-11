package com.andy.design.pattern;

public abstract class Payment {

    public abstract String getType();

    public abstract double queryBalance(String uid);

    public PayResult pay(String uid, double price) {
        double balance = queryBalance(uid);
        if (balance < price) {
            return new PayResult(2, "支付失败", "余额不足,余额:" + balance);
        }
        return new PayResult(1, "支付成功", "支付金额" + price);
    }
}

