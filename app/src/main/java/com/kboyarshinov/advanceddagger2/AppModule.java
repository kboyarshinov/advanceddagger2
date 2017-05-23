package com.kboyarshinov.advanceddagger2;

import android.app.Application;

import com.kboyarshinov.advanceddagger2.ui.RealToaster;
import com.kboyarshinov.advanceddagger2.ui.Toaster;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Reusable
    Toaster provideToaster() {
        return new RealToaster(application);
    }
}
