package com.kboyarshinov.advanceddagger2;

import dagger.android.AndroidInjector;

public class StubStoreApp extends StoreApp {

    @Override
    protected AndroidInjector<StoreApp> applicationInjector() {
        return DaggerStubComponent.builder().create(this);
    }
}
