package com.kboyarshinov.advanceddagger2;

import android.app.Application;

import com.kboyarshinov.advanceddagger2.ui.RealToaster;
import com.kboyarshinov.advanceddagger2.ui.Toaster;

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
