package com.kboyarshinov.d2.storeapp.payment;

import com.kboyarshinov.d2.storeapp.data.Product;

import javax.inject.Inject;

public class CreditCardPaymentProvider implements PaymentProvider {
    @Inject
    public CreditCardPaymentProvider() {
    }

    @Override
    public PaymentResult executePayment(Product product) {
        if (product.getPrice() > 1000) {
            return PaymentResult.DECLINED;
        }
        return PaymentResult.ACCEPTED;
    }
}
