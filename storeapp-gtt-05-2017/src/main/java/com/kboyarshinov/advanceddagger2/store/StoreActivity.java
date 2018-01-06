package com.kboyarshinov.advanceddagger2.store;

import android.os.Bundle;
import android.widget.TextView;

import com.kboyarshinov.advanceddagger2.R;
import com.kboyarshinov.advanceddagger2.data.Product;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class StoreActivity extends DaggerAppCompatActivity implements StoreView {
    @Inject
    StorePresenter storePresenter;
    private TextView productsCountView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        productsCountView = (TextView) findViewById(R.id.products_number);
        storePresenter.loadProducts();
    }

    @Override
    public void bindProducts(List<Product> productList) {
        productsCountView.setText("Products: " + productList.size());
    }
}
