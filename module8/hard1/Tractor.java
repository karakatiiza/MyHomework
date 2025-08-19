package com.varaxina.module8.hard1;

public class Tractor extends Car {
    public Tractor(String model, double price) {
        super(model, price);
    }

    @Override
    public String getType() {
        return "Трактор";
    }
}
