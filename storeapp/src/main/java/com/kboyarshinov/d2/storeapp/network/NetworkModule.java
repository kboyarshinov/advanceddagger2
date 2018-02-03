package com.kboyarshinov.d2.storeapp.network;

import com.kboyarshinov.d2.storeapp.AppScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
    private final String baseUrl;

    public NetworkModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    @NetworkUrl
    String baseUrl() {
        return baseUrl;
    }
}
