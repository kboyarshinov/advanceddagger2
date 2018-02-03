package com.kboyarshinov.d2.storeapp.data;

import com.kboyarshinov.d2.storeapp.network.ApiKey;
import com.kboyarshinov.d2.storeapp.network.NetworkUrl;
import com.kboyarshinov.d2.storeapp.store.StoreScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

@StoreScope
public class RealProductsRepository implements ProductRepository {

    private final String baseUrl;
    private final String apiKey;

    @Inject
    public RealProductsRepository(@NetworkUrl String baseUrl, @ApiKey String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
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
