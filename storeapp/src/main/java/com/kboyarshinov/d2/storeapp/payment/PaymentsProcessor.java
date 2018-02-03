package com.kboyarshinov.d2.storeapp.payment;

import com.kboyarshinov.d2.storeapp.AppScope;
import com.kboyarshinov.d2.storeapp.data.Product;

import java.util.Map;

import javax.inject.Inject;

@AppScope
public class PaymentsProcessor {
    private final Map<PaymentProvider.Type, PaymentProvider> providers;

    @Inject
    public PaymentsProcessor(Map<PaymentProvider.Type, PaymentProvider> providers) {
        this.providers = providers;
    }

    public PaymentProvider.PaymentResult executePayment(Product product, PaymentProvider.Type providerType) {
        return providers.get(providerType).executePayment(product);
    }
}
