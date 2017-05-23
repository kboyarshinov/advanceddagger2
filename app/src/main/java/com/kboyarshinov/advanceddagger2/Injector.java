package com.kboyarshinov.advanceddagger2;

import android.content.Context;
import android.support.annotation.NonNull;

import com.kboyarshinov.advanceddagger2.store.StoreActivity;
import com.kboyarshinov.advanceddagger2.store.StoreComponent;

public class Injector {
    @SuppressWarnings("WrongConstant")
    public static StoreAppComponent perApp(@NonNull Context context) {
        return (StoreAppComponent) context.getApplicationContext().getSystemService(StoreApp.APP_COMPONENT);
    }

    @SuppressWarnings("WrongConstant")
    public static StoreComponent perStoreActivity(@NonNull Context context) {
        return (StoreComponent) context.getSystemService(StoreActivity.ACTIVITY_COMPONENT);
    }
}
