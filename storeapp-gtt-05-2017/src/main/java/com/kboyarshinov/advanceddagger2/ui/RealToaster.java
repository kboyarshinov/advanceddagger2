package com.kboyarshinov.advanceddagger2.ui;

import android.content.Context;
import android.widget.Toast;

public class RealToaster implements Toaster {
    private final Context context;

    public RealToaster(Context context) {
        this.context = context;
    }

    @Override
    public void show(String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
