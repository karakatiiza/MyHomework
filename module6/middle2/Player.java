package com.varaxina.module6.middle2;

public class Player {
    String name;
    char symbol; // 'X' или 'O'

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
