package com.kboyarshinov.advanceddagger2;

import com.kboyarshinov.advanceddagger2.payment.PaymentsModule;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(modules = { AppModule.class, PaymentsModule.class, AndroidSupportInjectionModule.class, StubActivityBindingModule.class } )
public interface StubComponent extends StoreAppComponent {
    @Component.Builder
    abstract class Builder extends StoreAppComponent.Builder {
    }
}

