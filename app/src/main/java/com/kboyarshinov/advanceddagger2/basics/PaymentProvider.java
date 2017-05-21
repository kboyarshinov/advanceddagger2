package com.kboyarshinov.advanceddagger2.basics;

public interface PaymentProvider {

    PaymentResult executePayment(Product product);

    enum PaymentResult {
        ACCEPTED, DECLINED
    }
}
