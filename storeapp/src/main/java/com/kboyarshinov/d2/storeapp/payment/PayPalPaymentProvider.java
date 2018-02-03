package com.kboyarshinov.d2.storeapp.payment;

import com.kboyarshinov.d2.storeapp.data.Product;

import javax.inject.Inject;

public class PayPalPaymentProvider implements PaymentProvider {

    @Inject
    public PayPalPaymentProvider() {
    }

    @Override
    public PaymentResult executePayment(Product product) {
        if (product.getPrice() < 1000) {
            return PaymentResult.DECLINED;
        }
        return PaymentResult.ACCEPTED;
    }
}
