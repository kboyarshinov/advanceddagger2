package com.kboyarshinov.d2.storeapp.payment;

import com.kboyarshinov.d2.storeapp.data.Product;

public interface PaymentProvider {

    PaymentResult executePayment(Product product);

    enum PaymentResult {
        ACCEPTED, DECLINED
    }
}
