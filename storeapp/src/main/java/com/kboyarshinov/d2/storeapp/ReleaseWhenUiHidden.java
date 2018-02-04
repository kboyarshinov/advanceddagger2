package com.kboyarshinov.d2.storeapp;

import android.app.Application;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import dagger.android.ReleaseReferencesAt;

@ReleaseReferencesAt(Application.TRIM_MEMORY_UI_HIDDEN)
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ReleaseWhenUiHidden {
}
