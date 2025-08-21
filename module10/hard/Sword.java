package com.varaxina.module10.hard;

public class Sword implements Weapon{
    @Override
    public int getDamage(){
        return 20;
    }

    @Override
    public String getName(){
        return "Меч";
    }
}
