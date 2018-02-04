package com.kboyarshinov.d2.storeapp.store;

import com.kboyarshinov.d2.storeapp.data.Product;
import com.kboyarshinov.d2.storeapp.data.ProductRepository;
import com.kboyarshinov.d2.storeapp.payment.PaymentProvider;
import com.kboyarshinov.d2.storeapp.payment.PaymentsProcessor;
import com.kboyarshinov.d2.storeapp.payment.SignatureUploader;
import com.kboyarshinov.d2.storeapp.ui.Toaster;

import java.util.List;

import javax.inject.Inject;

@StoreScope
public class StorePresenter {

    private final ProductRepository productRepository;
    private final PaymentsProcessor paymentsProcessor;
    private final StoreView storeView;
    private final Toaster toaster;
    private final SignatureUploader signatureUploader;

    @Inject
    public StorePresenter(ProductRepository productRepository, PaymentsProcessor paymentsProcessor,
                          StoreView storeView, Toaster toaster, SignatureUploader signatureUploader) {
        this.productRepository = productRepository;
        this.paymentsProcessor = paymentsProcessor;
        this.storeView = storeView;
        this.toaster = toaster;
        this.signatureUploader = signatureUploader;
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
