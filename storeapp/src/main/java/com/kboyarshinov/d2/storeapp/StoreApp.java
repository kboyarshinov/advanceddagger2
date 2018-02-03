package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.thirdparty.AnalyticsLib;
import com.kboyarshinov.d2.storeapp.thirdparty.CrashReportingLib;
import com.kboyarshinov.d2.storeapp.thirdparty.ThirdPartyLib;

import java.util.Set;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class StoreApp extends DaggerApplication {

    @Inject
    Set<ThirdPartyLib> thirdPartyLibs;

    @Override
    public void onCreate() {
        super.onCreate();

        for (ThirdPartyLib thirdPartyLib : thirdPartyLibs) {
            thirdPartyLib.initialize();
        }
    }

    @Override
    protected AndroidInjector<StoreApp> applicationInjector() {
        return DaggerStoreAppComponent.builder()
                .create(this);
    }
}

