package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.data.ProductsModule;
import com.kboyarshinov.advanceddagger2.data.StubProductsModule;
import com.kboyarshinov.advanceddagger2.store.StoreActivity;
import com.kboyarshinov.advanceddagger2.store.StoreModule;
import com.kboyarshinov.advanceddagger2.store.StoreScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class StubActivityBindingModule {
    @StoreScope
    @ContributesAndroidInjector(modules = {StoreModule.class, StubProductsModule.class})
    abstract StoreActivity contributeStoreActivityInjector();
}
