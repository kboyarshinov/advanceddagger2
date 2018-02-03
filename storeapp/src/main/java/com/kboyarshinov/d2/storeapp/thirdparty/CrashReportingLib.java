package com.kboyarshinov.d2.storeapp.thirdparty;

import android.content.Context;

import com.kboyarshinov.d2.storeapp.StoreApp;

import javax.inject.Inject;

public class CrashReportingLib implements ThirdPartyLib {

    private final Context context;

    @Inject
    public CrashReportingLib(StoreApp context) {
        this.context = context;
    }

    @Override
    public void initialize() {
        // init lib
    }
}
