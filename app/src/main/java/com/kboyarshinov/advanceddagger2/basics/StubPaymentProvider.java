package com.kboyarshinov.advanceddagger2.basics;

public class StubPaymentProvider implements PaymentProvider {
    @Override
    public PaymentResult executePayment(Product product) {
        if (product.getPrice() > 1000) {
            return PaymentResult.DECLINED;
        }
        return PaymentResult.ACCEPTED;
    }
}
