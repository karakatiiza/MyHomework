package com.varaxina.module7.middle3;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Checker checker = new Checker();
    Converter converter = new Converter();

    public void start() {
        System.out.println("Игра 'Камень-ножницы-бумага'");
        System.out.println("Выберете число: 0 - Камень, 1 - Ножницы, 2 - Бумага");

        int player = scanner.nextInt();
        int computer = (int) (Math.random() * 3);

        System.out.println(converter.convertToWord(player) + " VS " + converter.convertToWord(computer));

        String result = checker.checkWinner(player, computer);
        System.out.println(result);
    }
}
