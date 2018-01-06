package com.kboyarshinov.d2.storeapp;

import dagger.android.AndroidInjector;

public class StubStoreApp extends StoreApp {

    @Override
    protected AndroidInjector<StoreApp> applicationInjector() {
        return DaggerStubComponent.builder().create(this);
    }
}
