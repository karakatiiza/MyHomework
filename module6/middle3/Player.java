package com.varaxina.module6.middle3;

public class Player {
    String name;
    boolean isComputer;

    public Player(String name, boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
    }

    public String getName() {
        return name;
    }

    public boolean isComputer() {
        return isComputer;
    }
}
