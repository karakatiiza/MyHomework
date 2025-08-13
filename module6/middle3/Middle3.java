package com.varaxina.module6.middle3;
import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        Player player = new Player(name, false);
        Player computer = new Player("Компьютер", true);

        Game game = new Game(player, computer);
        game.start();

        scanner.close();
    }
}
