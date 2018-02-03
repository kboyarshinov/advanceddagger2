package com.kboyarshinov.d2.storeapp.store;

import com.kboyarshinov.d2.storeapp.payment.PaymentsProcessor;
import com.kboyarshinov.d2.storeapp.ui.Toaster;
import com.kboyarshinov.d2.storeapp.data.Product;
import com.kboyarshinov.d2.storeapp.data.ProductRepository;
import com.kboyarshinov.d2.storeapp.payment.PaymentProvider;

import java.util.List;

import javax.inject.Inject;

@StoreScope
public class StorePresenter {

    private final ProductRepository productRepository;
    private final PaymentsProcessor paymentsProcessor;
    private final StoreView storeView;
    private final Toaster toaster;

    @Inject
    public StorePresenter(ProductRepository productRepository, PaymentsProcessor paymentsProcessor,
                          StoreView storeView, Toaster toaster) {
        this.productRepository = productRepository;
        this.paymentsProcessor = paymentsProcessor;
        this.storeView = storeView;
        this.toaster = toaster;
    }

    void loadProducts() {
        List<Product> products = productRepository.products();
        storeView.bindProducts(products);
    }

    void purchaseProduct(Product product) {
        PaymentProvider.PaymentResult paymentResult = paymentsProcessor.executePayment(product, PaymentProvider.Type.CREDIT_CARD);
        if (paymentResult == PaymentProvider.PaymentResult.ACCEPTED) {
            toaster.show("Payment accepted");
        } else {
            toaster.show("Payment declined");
        }
    }
}
