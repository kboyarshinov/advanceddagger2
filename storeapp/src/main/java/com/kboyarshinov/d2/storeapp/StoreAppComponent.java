package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.network.NetworkModule;
import com.kboyarshinov.d2.storeapp.payment.PaymentsModule;
import com.kboyarshinov.d2.storeapp.thirdparty.ThirdPartyLibModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(modules = { AppModule.class, NetworkModule.class, ThirdPartyLibModule.class,
        PaymentsModule.class, AndroidSupportInjectionModule.class, ActivityBindingModule.class } )
public interface StoreAppComponent extends AndroidInjector<StoreApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<StoreApp> {
        abstract Builder networkModule(NetworkModule networkModule);
        abstract Builder appModule(AppModule appModule);
    }
}
