package com.kboyarshinov.advanceddagger2.store;

import com.kboyarshinov.advanceddagger2.AppScope;
import com.kboyarshinov.advanceddagger2.StoreAppComponent;
import com.kboyarshinov.advanceddagger2.data.ProductsModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@StoreScope
@Subcomponent(modules = StoreModule.class)
public interface StoreComponent {
    void inject(StoreActivity storeActivity);
}
