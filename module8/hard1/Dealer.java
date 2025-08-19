package com.varaxina.module8.hard1;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        System.out.println(car + " добавлен в автосалон.");
    }

    public void sellCar(String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                cars.remove(car);
                System.out.println(car + " продан.");
                return;
            }
        }
        System.out.println("Автомобиль модели " + model + " не найден.");
    }

    public void showAllCars() {
        if (cars.isEmpty()) {
            System.out.println("В автосалоне нет автомобилей.");
        } else {
            System.out.println("Список автомобилей в автосалоне:");
            for (Car car : cars) {
                System.out.println(" - " + car);
            }
        }
    }

    public void showMostExpensive() {
        if (cars.isEmpty()) {
            System.out.println("Нет автомобилей.");
            return;
        }
        Car expensive = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() > expensive.getPrice()) {
                expensive = car;
            }
        }
        System.out.println("Самый дорогой автомобиль: " + expensive);
    }

    public void showCheapest() {
        if (cars.isEmpty()) {
            System.out.println("Нет автомобилей.");
            return;
        }
        Car cheap = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() < cheap.getPrice()) {
                cheap = car;
            }
        }
        System.out.println("Самый дешёвый автомобиль: " + cheap);
    }
}

