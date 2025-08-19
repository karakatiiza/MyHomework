package com.varaxina.module8.hard1;

public class PassengerCar extends Car {
    public PassengerCar(String model, double price) {
        super(model, price);
    }

    @Override
    public String getType() {
        return "Легковой автомобиль";
    }
}

