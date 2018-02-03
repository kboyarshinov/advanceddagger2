package com.kboyarshinov.d2.objects;

import javax.inject.Inject;

public class FooManager {
    private final Foo foo;

    @Inject
    public FooManager(Foo foo) {
        this.foo = foo;
    }
}
