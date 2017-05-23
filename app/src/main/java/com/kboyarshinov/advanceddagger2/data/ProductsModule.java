package com.kboyarshinov.advanceddagger2.data;

import com.kboyarshinov.advanceddagger2.store.StoreScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ProductsModule {
    @Provides
    @StoreScope
    ProductRepository provideProductRepository() {
        return new RealProductsRepository();
    }
}
