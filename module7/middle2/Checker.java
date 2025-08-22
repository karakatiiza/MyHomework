package com.varaxina.module7.middle2;

public class Checker {
    public boolean checkGuess(int guess, int secretNumber) {
        if (guess > secretNumber) {
            System.out.println("Загаданное число меньше!");
            return false;
        } else if (guess < secretNumber) {
            System.out.println("Загаданное число больше!");
            return false;
        } else {
            System.out.println("Поздравляем, вы угадали!");
            return true;
        }
    }
}
