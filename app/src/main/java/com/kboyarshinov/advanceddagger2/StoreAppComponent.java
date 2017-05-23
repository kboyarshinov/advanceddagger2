package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.payment.PaymentsModule;
import com.kboyarshinov.advanceddagger2.store.StoreComponent;
import com.kboyarshinov.advanceddagger2.store.StoreModule;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class, PaymentsModule.class} )
public interface StoreAppComponent {
    // declaring subcomponents
    StoreComponent plus(StoreModule storeModule);
}
