package com.kboyarshinov.advanceddagger2.payment;

import com.kboyarshinov.advanceddagger2.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class PaymentsModule {
    @Provides
    @AppScope
    PaymentProvider providePaymentProvider() {
        return new RealPaymentProvider();
    }
}
