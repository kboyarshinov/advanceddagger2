package com.kboyarshinov.advanceddagger2.data;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ProductsModule {
    @Binds
    abstract ProductRepository productRepository(RealProductsRepository realProductsRepository);
}
