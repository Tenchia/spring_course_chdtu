package com.example.lab1;

public class Motherboard extends Product{
    private String brand;

    public Motherboard(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
