package com.varaxina.module8.hard1;

public class SportCar extends Car {
    public SportCar(String model, double price) {
        super(model, price);
    }

    @Override
    public String getType() {
        return "Спортивный автомобиль";
    }
}

