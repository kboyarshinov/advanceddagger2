package com.kboyarshinov.advanceddagger2.store;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.kboyarshinov.advanceddagger2.Injector;
import com.kboyarshinov.advanceddagger2.R;
import com.kboyarshinov.advanceddagger2.StoreApp;
import com.kboyarshinov.advanceddagger2.StoreAppComponent;
import com.kboyarshinov.advanceddagger2.data.Product;

import java.util.List;

import javax.inject.Inject;

public class StoreActivity extends AppCompatActivity implements StoreView {

    public static final String ACTIVITY_COMPONENT = StoreActivity.class.getName().concat(".activityComponent");

    @Inject
    StorePresenter storePresenter;

    private StoreComponent storeComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        storeComponent = buildComponent();
        storeComponent.inject(this);

        setContentView(R.layout.activity_store);
        storePresenter.loadProducts();
    }

    protected StoreComponent buildComponent() {
        StoreAppComponent storeAppComponent = Injector.perApp(this);
        return storeAppComponent
                .plus(new StoreModule(this));
    }


    @Override
    public void bindProducts(List<Product> productList) {
        // TODO
    }

    @Override
    public Object getSystemService(@NonNull String name) {
        if (ACTIVITY_COMPONENT.equals(name)) {
            return storeComponent;
        }
        return super.getSystemService(name);
    }
}
