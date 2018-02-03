package com.kboyarshinov.d2.storeapp.data;

import com.kboyarshinov.d2.storeapp.store.StoreScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class StubProductsModule {
    @Binds
    abstract ProductRepository productRepository(StubProductsRepository stubProductsRepository);

    @StoreScope
    static class StubProductsRepository implements ProductRepository {

        @Inject
        public StubProductsRepository() {
        }

        @Override
        public List<Product> products() {
            ArrayList<Product> products = new ArrayList<>(5);
            products.add(new Product("Apple", 2));
            return products;
        }
    }
}
