package com.varaxina.module10.hard;

public class Gun implements Weapon{
    @Override
    public String getName() {
        return "Пистолет";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
