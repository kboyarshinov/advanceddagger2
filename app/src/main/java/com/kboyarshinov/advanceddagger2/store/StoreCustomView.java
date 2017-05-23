package com.kboyarshinov.advanceddagger2.store;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.kboyarshinov.advanceddagger2.Injector;

import javax.inject.Inject;

public class StoreCustomView extends FrameLayout {
    // @Inject
    // something

    public StoreCustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Injector.perStoreActivity(context).inject(this);
    }
}
