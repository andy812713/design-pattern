package com.andy.design.pattern;

public class PaymentTest {

    public static void main(String[] args) {
        Order order = new Order("MsWang", "TV", 10000);
        PayResult result = order.pay(PayTypeEnum.CFU_PAY);
        if(result.getCode() != 1){
            System.out.println("支付失败，更换支付方式");
            System.out.println(order.pay(PayTypeEnum.ALI_PAY));
        }
    }
}
