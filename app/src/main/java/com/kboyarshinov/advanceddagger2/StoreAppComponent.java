package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.activity.Toaster;
import com.kboyarshinov.advanceddagger2.payment.PaymentProvider;
import com.kboyarshinov.advanceddagger2.payment.PaymentsModule;

import javax.inject.Singleton;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class, PaymentsModule.class} )
public interface StoreAppComponent {
    PaymentProvider paymentProvider();
    Toaster toaster();
}
