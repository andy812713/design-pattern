package com.andy.design.pattern;

public enum PayTypeEnum {

    ALI_PAY(new AliPay()),
    CFU_PAY(new Cfu());

    private Payment payment;

    PayTypeEnum(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return this.payment;
    }
}
