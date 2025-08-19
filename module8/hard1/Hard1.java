package com.varaxina.module8.hard1;

public class Hard1 {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        dealer.addCar(new PassengerCar("Toyota Camry", 50000));
        dealer.addCar(new SportCar("Chevrolet Camaro", 220000));
        dealer.addCar(new Tractor("Кировец К-424", 190000));

        System.out.println();
        dealer.showAllCars();

        System.out.println();
        dealer.showMostExpensive();
        dealer.showCheapest();

        System.out.println();
        dealer.sellCar("Toyota Camry");
        dealer.sellCar("BMW X5");

        System.out.println();
        dealer.showAllCars();
    }
}
