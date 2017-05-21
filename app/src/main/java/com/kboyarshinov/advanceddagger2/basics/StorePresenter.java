package com.kboyarshinov.advanceddagger2.basics;

import android.support.annotation.Nullable;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class StorePresenter {

    private final ProductRepository productRepository;
    private final PaymentProvider paymentProvider;

    @Nullable
    private StoreView storeView;

    @Inject
    public StorePresenter(ProductRepository productRepository, PaymentProvider paymentProvider) {
        this.productRepository = productRepository;
        this.paymentProvider = paymentProvider;
    }

    public void setStoreView(@Nullable StoreView storeView) {
        this.storeView = storeView;
    }

    void loadProducts() {
        List<Product> products = productRepository.products();
        if (storeView != null) {
            storeView.bindProducts(products);
        }
    }

    void purchaseProduct(Product product) {
        PaymentProvider.PaymentResult paymentResult = paymentProvider.executePayment(product);
        if (storeView != null) {
            if (paymentResult == PaymentProvider.PaymentResult.ACCEPTED) {
                storeView.showPaymentAccepted();
            } else {
                storeView.showPaymentDeclined();
            }
        }
    }
}
