package com.varaxina.module7.middle1;

import java.util.Scanner;

public class Game {
    Player player = new Player();
    Thimble thimble = new Thimble();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Угадай под каким напёрстком спрятана монетка.");

        while (player.getWinCounter() < 3) {
            int number = thimble.showNumberThimble();

            System.out.print("Выбреете номер напёрстка (1, 2 или 3): ");
            int answer = scanner.nextInt();

            if (answer == number) {
                player.increaseWinCounter();
            } else {
                System.out.println("Вы не угадали! Монетка была под номером " + number);
            }
            System.out.println("Текущий результат: " + player.getWinCounter());
        }

        System.out.println("Поздравляю! Вы выиграли игру, угадав 3 раза!");
    }
}
