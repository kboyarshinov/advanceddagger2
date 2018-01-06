package com.kboyarshinov.advanceddagger2.store;

import com.kboyarshinov.advanceddagger2.data.Product;

import java.util.List;

public interface StoreView {
    void bindProducts(List<Product> productList);
}
