package com.kboyarshinov.d2.storeapp.payment;

import android.graphics.Bitmap;

import com.kboyarshinov.d2.storeapp.ReleaseWhenUiHidden;

import javax.inject.Inject;

@ReleaseWhenUiHidden
public class SignatureUploader {
    @Inject
    public SignatureUploader() {
    }

    public void uploadSignature(Bitmap signature) {
        // do upload
    }
}
