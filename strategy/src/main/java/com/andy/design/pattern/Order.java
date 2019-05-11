package com.andy.design.pattern;

public class Order {

    private String uid;
    private String orderId;
    private double price;

    public Order(String uid,String orderId,double price){
        this.uid = uid;
        this.orderId = orderId;
        this.price = price;
    }

    public PayResult pay(PayTypeEnum payTypeEnum){
        Payment p = payTypeEnum.getPayment();
        System.out.println("欢迎使用:" + p.getType());
        System.out.println("本次交易金额为：" + price + ", 开始扣款...");
        return p.pay(uid,price);
    }

}
