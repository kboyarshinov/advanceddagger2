package com.kboyarshinov.d2.storeapp.data;

public class Product {
    private final String name;
    private final float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
