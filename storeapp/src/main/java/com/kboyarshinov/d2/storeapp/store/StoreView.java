package com.kboyarshinov.d2.storeapp.store;

import com.kboyarshinov.d2.storeapp.data.Product;

import java.util.List;

public interface StoreView {
    void bindProducts(List<Product> productList);
}
