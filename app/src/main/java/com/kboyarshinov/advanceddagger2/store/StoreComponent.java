package com.kboyarshinov.advanceddagger2.store;

import dagger.Subcomponent;

@StoreScope
@Subcomponent(modules = StoreModule.class)
public interface StoreComponent {
    void inject(StoreActivity storeActivity);
    // new inject declaration
    void inject(StoreCustomView storeActivity);
}
