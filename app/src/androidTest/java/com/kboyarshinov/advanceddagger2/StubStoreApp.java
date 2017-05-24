package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.payment.PaymentsModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

public class StubStoreApp extends StoreApp {

    @Override
    protected AndroidInjector<StoreApp> applicationInjector() {
        return DaggerStubComponent.builder().create(this);
    }
}
