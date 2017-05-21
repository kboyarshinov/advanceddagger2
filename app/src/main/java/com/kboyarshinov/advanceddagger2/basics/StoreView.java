package com.kboyarshinov.advanceddagger2.basics;

import java.util.List;

public interface StoreView {
    void bindProducts(List<Product> productList);
    void showPaymentAccepted();
    void showPaymentDeclined();
}
