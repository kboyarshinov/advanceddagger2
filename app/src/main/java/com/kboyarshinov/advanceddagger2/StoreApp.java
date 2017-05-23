package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.payment.PaymentsModule;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class StoreApp extends DaggerApplication {

    @Override
    protected AndroidInjector<StoreApp> applicationInjector() {
        StoreAppComponent.Builder builder = DaggerStoreAppComponent.builder();
        builder.appModule(new AppModule(this));
        builder.seedInstance(this);
        return builder.build();
    }
}
