package com.kboyarshinov.advanceddagger2.basics;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PaymentsModule {
    @Provides
    @Singleton
    PaymentProvider providePaymentProvider() {
        return new StubPaymentProvider();
    }
}
