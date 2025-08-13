package com.varaxina.module6.middle4;
import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        Game game = new Game(player1, player2);

        String choice;
        do {
            game.startRound();
            System.out.print("Хотите сыграть ещё? (да/нет): ");
            choice = scanner.next().toLowerCase();
        } while (choice.equals("да"));

        game.printResults();
        scanner.close();
    }
}
