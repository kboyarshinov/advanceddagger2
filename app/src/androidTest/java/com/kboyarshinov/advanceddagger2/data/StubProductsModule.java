package com.kboyarshinov.advanceddagger2.data;

import com.kboyarshinov.advanceddagger2.store.StoreScope;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class StubProductsModule {
    @Provides
    @StoreScope
    ProductRepository provideProductRepository() {
        return new StubProductsRepository();
    }

    static class StubProductsRepository implements ProductRepository {
        @Override
        public List<Product> products() {
            ArrayList<Product> products = new ArrayList<>(5);
            products.add(new Product("Apple", 2));
            return products;
        }
    }
}
