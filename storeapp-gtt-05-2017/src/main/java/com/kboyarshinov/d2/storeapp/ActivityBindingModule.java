package com.kboyarshinov.d2.storeapp;

import com.kboyarshinov.d2.storeapp.data.ProductsModule;
import com.kboyarshinov.d2.storeapp.store.StoreActivity;
import com.kboyarshinov.d2.storeapp.store.StoreModule;
import com.kboyarshinov.d2.storeapp.store.StoreScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @StoreScope
    @ContributesAndroidInjector(modules = {StoreModule.class, ProductsModule.class})
    abstract StoreActivity contributeStoreActivityInjector();
}
