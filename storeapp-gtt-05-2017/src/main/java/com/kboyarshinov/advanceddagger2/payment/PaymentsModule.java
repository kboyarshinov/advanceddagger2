package com.kboyarshinov.advanceddagger2.payment;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PaymentsModule {
    @Binds
    abstract PaymentProvider paymentProvider(RealPaymentProvider realPaymentProvider);
}
