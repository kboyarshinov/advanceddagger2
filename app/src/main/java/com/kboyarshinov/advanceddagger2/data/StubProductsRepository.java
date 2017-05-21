package com.kboyarshinov.advanceddagger2.data;

import java.util.ArrayList;
import java.util.List;

public class StubProductsRepository implements ProductRepository {
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
