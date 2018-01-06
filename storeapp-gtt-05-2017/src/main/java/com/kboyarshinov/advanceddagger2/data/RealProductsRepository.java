package com.kboyarshinov.advanceddagger2.data;

import com.kboyarshinov.advanceddagger2.store.StoreScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

@StoreScope
public class RealProductsRepository implements ProductRepository {

    @Inject
    public RealProductsRepository() {
    }

    @Override
    public List<Product> products() {
        ArrayList<Product> products = new ArrayList<>(5);
        products.add(new Product("Apple", 2));
        products.add(new Product("Wine", 20));
        products.add(new Product("Coke", 0.7f));
        products.add(new Product("Chocolate", 3));
        return products;
    }
}
