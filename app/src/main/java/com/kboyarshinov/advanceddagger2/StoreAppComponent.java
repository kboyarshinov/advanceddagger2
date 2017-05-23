package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.payment.PaymentsModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(modules = { AppModule.class, PaymentsModule.class, AndroidSupportInjectionModule.class, ActivityBindingModule.class } )
public interface StoreAppComponent extends AndroidInjector<StoreApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<StoreApp> {
        abstract Builder appModule(AppModule appModule);
    }
}
