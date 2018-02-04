package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.network.NetworkModule;
import com.kboyarshinov.d2.storeapp.thirdparty.AnalyticsLib;
import com.kboyarshinov.d2.storeapp.thirdparty.CrashReportingLib;
import com.kboyarshinov.d2.storeapp.thirdparty.ThirdPartyLib;

import java.util.Set;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.AndroidMemorySensitiveReferenceManager;
import dagger.android.AndroidMemorySensitiveReferenceManager_Factory;
import dagger.android.support.DaggerApplication;

public class StoreApp extends DaggerApplication {

    @Inject
    AndroidMemorySensitiveReferenceManager memoryRefManager;

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
                .networkModule(new NetworkModule("http://testurl.com/"))
                .apiKey("a6wg2udy62sd1j6aqudfu823sdaf2")
                .create(this);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        memoryRefManager.onTrimMemory(level);
    }
}

