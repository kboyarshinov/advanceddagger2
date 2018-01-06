package com.kboyarshinov.advanceddagger2.payment;

import com.kboyarshinov.advanceddagger2.AppScope;
import com.kboyarshinov.advanceddagger2.data.Product;

import javax.inject.Inject;

@AppScope
public class RealPaymentProvider implements PaymentProvider {
    @Inject
    public RealPaymentProvider() {
    }

    @Override
    public PaymentResult executePayment(Product product) {
        if (product.getPrice() > 1000) {
            return PaymentResult.DECLINED;
        }
        return PaymentResult.ACCEPTED;
    }
}
