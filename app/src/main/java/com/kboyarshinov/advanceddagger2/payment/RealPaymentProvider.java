package com.kboyarshinov.advanceddagger2.payment;

import com.kboyarshinov.advanceddagger2.data.Product;

public class RealPaymentProvider implements PaymentProvider {
    @Override
    public PaymentResult executePayment(Product product) {
        if (product.getPrice() > 1000) {
            return PaymentResult.DECLINED;
        }
        return PaymentResult.ACCEPTED;
    }
}
