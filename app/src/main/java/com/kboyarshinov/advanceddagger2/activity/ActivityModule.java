package com.kboyarshinov.advanceddagger2.activity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

public class ActivityModule<A extends Activity> {
    private final A activity;

    public ActivityModule(A activity) {
        this.activity = activity;
    }

    protected A getActivity() {
        return activity;
    }
}
