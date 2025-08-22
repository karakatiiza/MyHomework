package com.varaxina.module7.middle2;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите режим игры:");
        System.out.println("1 - Без ограничений по попыткам");
        System.out.println("2 - С ограничением по попыткам");

        int choice = scanner.nextInt();

        if (choice == 1) {
            game.startUnlimited();
        } else if (choice == 2) {
            System.out.print("Введите количество попыток: ");
            int attempts;
            do {
                System.out.println("Число должно быть больше 0!");
                attempts = scanner.nextInt();
            } while (attempts < 1);
            game.startLimited(attempts);
        } else {
            System.out.println("Неверный выбор режима!");
        }
    }
}
