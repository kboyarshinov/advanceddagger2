package com.kboyarshinov.advanceddagger2.payment;

import com.kboyarshinov.advanceddagger2.data.Product;

public interface PaymentProvider {

    PaymentResult executePayment(Product product);

    enum PaymentResult {
        ACCEPTED, DECLINED
    }
}
