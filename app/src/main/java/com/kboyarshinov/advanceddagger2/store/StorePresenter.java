package com.kboyarshinov.advanceddagger2.store;

import com.kboyarshinov.advanceddagger2.activity.Toaster;
import com.kboyarshinov.advanceddagger2.data.Product;
import com.kboyarshinov.advanceddagger2.data.ProductRepository;
import com.kboyarshinov.advanceddagger2.payment.PaymentProvider;

import java.util.List;

import javax.inject.Inject;

@StoreScope
public class StorePresenter {

    private final ProductRepository productRepository;
    private final PaymentProvider paymentProvider;
    private final StoreView storeView;
    private final Toaster toaster;

    @Inject
    public StorePresenter(ProductRepository productRepository, PaymentProvider paymentProvider,
                          StoreView storeView, Toaster toaster) {
        this.productRepository = productRepository;
        this.paymentProvider = paymentProvider;
        this.storeView = storeView;
        this.toaster = toaster;
    }

    void loadProducts() {
        List<Product> products = productRepository.products();
        storeView.bindProducts(products);
    }

    void purchaseProduct(Product product) {
        PaymentProvider.PaymentResult paymentResult = paymentProvider.executePayment(product);
        if (paymentResult == PaymentProvider.PaymentResult.ACCEPTED) {
            toaster.show("Payment accepted");
        } else {
            toaster.show("Payment declined");
        }
    }
}
