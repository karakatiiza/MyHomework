package com.varaxina.module10.hard;

public interface Hero {
    String getName();
    int getHealth();
    void getDamage(int damage);
    void attack(Hero opponent);
    boolean isAlive();
}
