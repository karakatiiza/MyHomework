package com.varaxina.module10.hard;

public class Spear implements Weapon{
    @Override
    public String getName() {
        return "Копьё";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
