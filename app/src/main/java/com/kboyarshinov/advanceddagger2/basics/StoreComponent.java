package com.kboyarshinov.advanceddagger2.basics;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { ProductsModule.class, PaymentsModule.class })
public interface StoreComponent {
    void inject(StoreActivity storeActivity);
}
