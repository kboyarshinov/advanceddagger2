package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.data.StubProductsModule;
import com.kboyarshinov.d2.storeapp.store.StoreActivity;
import com.kboyarshinov.d2.storeapp.store.StoreModule;
import com.kboyarshinov.d2.storeapp.store.StoreScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class StubActivityBindingModule {
    @StoreScope
    @ContributesAndroidInjector(modules = {StoreModule.class, StubProductsModule.class})
    abstract StoreActivity contributeStoreActivityInjector();
}
