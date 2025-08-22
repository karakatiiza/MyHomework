package com.varaxina.module7.middle4;

public class Dice {
    public int roll() {
        int number = (int) (Math.random() * 6);
        return number + 1;
    }
}
