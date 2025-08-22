package com.varaxina.module7.middle2;

import java.util.Scanner;

public class Game {
    Checker checker = new Checker();
    Scanner scanner = new Scanner(System.in);
    int number;

    public void startUnlimited() {
        number = (int) (Math.random() * 10) + 1;
        System.out.println("Компьютер загадал число от 1 до 10. Попробуйте угадать!");

        int guess;
        do {
            System.out.print("Введите число: ");
            guess = scanner.nextInt();
        } while (!checker.checkGuess(guess, number));
    }

    public void startLimited(int maxAttempts) {
        number = (int) (Math.random() * 10) + 1;
        System.out.println("Компьютер загадал число от 1 до 10. У вас есть " + maxAttempts + " попыток!");

        boolean guessed = false;
        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Попытка " + i + ": ");
            int guess = scanner.nextInt();

            if (checker.checkGuess(guess, number)) {
                System.out.println("Количество потраченных попыток: " + i);
                guessed = true;
                break;
            }
        }

        if (!guessed) {
            System.out.println("Попытки закончились. Загаданное число было: " + number);
        }
    }

}
