package com.kboyarshinov.advanceddagger2;

import android.app.Application;

public class StoreApp extends Application {

    private StoreAppComponent storeAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        storeAppComponent = DaggerStoreAppComponent.builder().build();
    }

    public StoreAppComponent getStoreAppComponent() {
        return storeAppComponent;
    }
}
