package com.kboyarshinov.advanceddagger2;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class StoreApp extends DaggerApplication {

    @Override
    protected AndroidInjector<StoreApp> applicationInjector() {
        return DaggerStoreAppComponent.builder()
            .create(this);
    }
}
