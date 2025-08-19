package com.varaxina.module8.hard1;

public abstract class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " " + model + " (Цена: " + price + ")";
    }
}

