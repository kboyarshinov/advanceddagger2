package com.kboyarshinov.d2.components;

import com.kboyarshinov.d2.FooProvider;
import com.kboyarshinov.d2.objects.FooView;

import dagger.Component;

@Component(dependencies = FooProvider.class)
public interface FooComponent {
    void inject(FooView fooView);
}
