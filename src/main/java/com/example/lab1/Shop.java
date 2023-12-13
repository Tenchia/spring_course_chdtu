package com.example.lab1;

import java.util.List;

public class Shop {
    private List<Product> products;
    private String name;

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
