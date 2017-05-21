package com.kboyarshinov.advanceddagger2.basics;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.kboyarshinov.advanceddagger2.R;

import java.util.List;

import javax.inject.Inject;

public class StoreActivity extends AppCompatActivity implements StoreView {

    @Inject
    StorePresenter storePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildComponent().inject(this);

        setContentView(R.layout.activity_store);
        storePresenter.setStoreView(this);
        storePresenter.loadProducts();
    }

    protected StoreComponent buildComponent() {
        return DaggerStoreComponent.builder().build();
    }

    @Override
    public void bindProducts(List<Product> productList) {
        // TODO
    }

    @Override
    public void showPaymentAccepted() {
        Toast.makeText(this, "Payment accepted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPaymentDeclined() {
        Toast.makeText(this, "Payment declined", Toast.LENGTH_SHORT).show();
    }
}
