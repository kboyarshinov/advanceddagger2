package com.kboyarshinov.advanceddagger2.store;

import dagger.Module;
import dagger.Provides;

@Module
public class StoreModule {

    @Provides
    StoreView provideStoreView(StoreActivity storeActivity) {
        return storeActivity;
    }
}
