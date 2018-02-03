package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.payment.PaymentsModule;
import com.kboyarshinov.d2.storeapp.thirdparty.ThirdPartyLibModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(modules = { AppModule.class, ThirdPartyLibModule.class, PaymentsModule.class, AndroidSupportInjectionModule.class, ActivityBindingModule.class } )
public interface StoreAppComponent extends AndroidInjector<StoreApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<StoreApp> {
        abstract Builder appModule(AppModule appModule);
    }
}
