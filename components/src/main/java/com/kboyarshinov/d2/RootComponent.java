package com.kboyarshinov.d2;

import com.kboyarshinov.d2.modules.FooBarModule;
import com.kboyarshinov.d2.objects.Foo;
import com.kboyarshinov.d2.subcomponents.BarSubcomponent;

import dagger.Component;

@Component(modules = FooBarModule.class)
public interface RootComponent extends FooProvider {
    BarSubcomponent childSubcomponent();
}
