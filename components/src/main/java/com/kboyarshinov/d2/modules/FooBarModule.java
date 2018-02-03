package com.kboyarshinov.d2.modules;

import com.kboyarshinov.d2.objects.Bar;
import com.kboyarshinov.d2.objects.Foo;

import dagger.Module;
import dagger.Provides;

@Module
public class FooBarModule {
    @Provides
    static Bar bar() {
        return new Bar();
    }

    @Provides
    static Foo foo() {
        return new Foo();
    }
}
