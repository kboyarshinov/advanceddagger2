package com.kboyarshinov.advanceddagger2;

import android.app.Application;
import android.support.annotation.NonNull;

public class StoreApp extends Application {

    public static final String APP_COMPONENT = StoreApp.class.getName().concat(".appComponent");

    private StoreAppComponent storeAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        storeAppComponent = DaggerStoreAppComponent.builder().build();
    }

    @Override
    public Object getSystemService(@NonNull String name) {
        if (APP_COMPONENT.equals(name)) {
            return storeAppComponent;
        }
        return super.getSystemService(name);
    }
}
