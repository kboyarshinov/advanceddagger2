package com.kboyarshinov.advanceddagger2.store;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.kboyarshinov.advanceddagger2.R;
import com.kboyarshinov.advanceddagger2.StoreApp;
import com.kboyarshinov.advanceddagger2.StoreAppComponent;
import com.kboyarshinov.advanceddagger2.data.Product;

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
        storePresenter.loadProducts();
    }

    protected StoreComponent buildComponent() {
        StoreAppComponent storeAppComponent = ((StoreApp) getApplicationContext()).getStoreAppComponent();
        return storeAppComponent
                .plus(new StoreModule(this));
    }

    @Override
    public void bindProducts(List<Product> productList) {
        // TODO
    }

}
