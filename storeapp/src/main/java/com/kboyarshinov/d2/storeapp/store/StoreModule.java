package com.kboyarshinov.d2.storeapp.store;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class StoreModule {

    @Binds
    abstract StoreView provideStoreView(StoreActivity storeActivity);
}
