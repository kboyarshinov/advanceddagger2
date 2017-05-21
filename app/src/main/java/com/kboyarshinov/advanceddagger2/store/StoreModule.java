package com.kboyarshinov.advanceddagger2.store;

import com.kboyarshinov.advanceddagger2.activity.ActivityModule;
import com.kboyarshinov.advanceddagger2.activity.RealToaster;
import com.kboyarshinov.advanceddagger2.activity.Toaster;
import com.kboyarshinov.advanceddagger2.data.ProductsModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module(includes = ProductsModule.class)
public class StoreModule extends ActivityModule<StoreActivity> {

    public StoreModule(StoreActivity activity) {
        super(activity);
    }

    @Provides
    StoreView provideStoreView() {
        return getActivity();
    }
}
