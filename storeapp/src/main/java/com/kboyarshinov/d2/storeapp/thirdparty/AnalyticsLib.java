package com.kboyarshinov.d2.storeapp.thirdparty;

import android.content.Context;

import com.kboyarshinov.d2.storeapp.StoreApp;

import javax.inject.Inject;

public class AnalyticsLib implements ThirdPartyLib {

    private final Context context;

    @Inject
    public AnalyticsLib(StoreApp context) {
        this.context = context;
    }

    @Override
    public void initialize() {
        // init lib
    }
}
