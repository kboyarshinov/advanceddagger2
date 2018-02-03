package com.kboyarshinov.d2.storeapp.test;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

import com.kboyarshinov.d2.storeapp.StubStoreApp;

public class TestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, StubStoreApp.class.getName(), context);
    }

}
