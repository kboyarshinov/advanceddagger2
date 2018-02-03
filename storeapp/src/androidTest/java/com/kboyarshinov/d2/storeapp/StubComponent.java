package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.payment.PaymentsModule;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(modules = { AppModule.class, PaymentsModule.class, AndroidSupportInjectionModule.class, StubActivityBindingModule.class } )
public interface StubComponent extends StoreAppComponent {
    @Component.Builder
    abstract class Builder extends StoreAppComponent.Builder {
    }
}

