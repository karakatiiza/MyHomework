package com.varaxina.module7.middle1;

public class Player {
    private int winCounter = 0;

    public void increaseWinCounter() {
        winCounter++;
        System.out.println("Вы угадали, получите балл!");
    }

    public int getWinCounter() {
        return winCounter;
    }
}
