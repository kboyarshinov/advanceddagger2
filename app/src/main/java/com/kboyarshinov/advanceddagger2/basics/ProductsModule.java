package com.kboyarshinov.advanceddagger2.basics;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ProductsModule {
    @Provides
    @Singleton
    ProductRepository provideProductRepository() {
        return new StubProductsRepository();
    }
}
