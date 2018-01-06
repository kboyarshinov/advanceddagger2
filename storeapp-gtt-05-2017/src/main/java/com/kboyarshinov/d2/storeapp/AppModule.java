package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.ui.RealToaster;
import com.kboyarshinov.d2.storeapp.ui.Toaster;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class AppModule {
    @Provides
    @Reusable
    Toaster provideToaster(StoreApp application) {
        return new RealToaster(application);
    }
}
