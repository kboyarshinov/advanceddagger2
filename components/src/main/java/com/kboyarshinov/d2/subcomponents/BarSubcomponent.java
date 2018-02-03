package com.kboyarshinov.d2.subcomponents;

import com.kboyarshinov.d2.objects.BarView;

import dagger.Subcomponent;

@Subcomponent
public interface BarSubcomponent {
    void inject(BarView barView);
}
