package com.kboyarshinov.d2.storeapp.payment;

import dagger.MapKey;

@MapKey
public @interface PaymentTypeKey {
    PaymentProvider.Type type();
}
