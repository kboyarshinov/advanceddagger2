package com.kboyarshinov.d2.objects;

import javax.inject.Inject;

public class BarManager {
    private final Bar bar;

    @Inject
    public BarManager(Bar bar) {
        this.bar = bar;
    }
}
