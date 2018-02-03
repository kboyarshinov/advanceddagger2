package com.kboyarshinov.d2.storeapp.payment;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class PaymentsModule {
    @Binds
    @IntoMap
    @PaymentTypeKey(type = PaymentProvider.Type.PAYPAL)
    abstract PaymentProvider paypalProvider(PayPalPaymentProvider provider);

    @Binds
    @IntoMap
    @PaymentTypeKey(type = PaymentProvider.Type.CREDIT_CARD)
    abstract PaymentProvider creditCardProvider(CreditCardPaymentProvider provider);
}
