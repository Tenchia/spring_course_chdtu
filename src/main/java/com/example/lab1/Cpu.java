package com.example.lab1;

public class Cpu extends Product{
    private String category;

    public Cpu(String category){
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
