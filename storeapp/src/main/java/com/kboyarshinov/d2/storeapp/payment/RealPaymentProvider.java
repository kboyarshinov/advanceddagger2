package com.kboyarshinov.d2.storeapp.payment;

import com.kboyarshinov.d2.storeapp.AppScope;
import com.kboyarshinov.d2.storeapp.data.Product;

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
