package com.varaxina.module6.middle4;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    int target;
    int sum;
    Random random;
    Scanner scanner;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void startRound() {
        target = random.nextInt(100) + 1; // от 1 до 100
        sum = 0;

        System.out.println("Компьютер загадал число от 1 до 100.");

        while (true) {
            if (playerMove(player1)) break;
            if (playerMove(player2)) break;
        }
    }

    private boolean playerMove(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        int num;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > 0) break;
            } else {
                scanner.next();
            }
            System.out.print("Введите положительное число: ");
        }

        sum += num;
        System.out.println("Сумма сейчас: " + sum);

        if (sum > target) {
            System.out.println(player.getName() + " проиграл(а)! Победил(а) " + getOpponent(player).getName() + "!");
            getOpponent(player).addWin();
            return true;
        }

        return false;
    }

    private Player getOpponent(Player current) {
        return (current == player1) ? player2 : player1;
    }

    public void printResults() {
        System.out.println("Итоги:");
        System.out.println(player1.getName() + ": " + player1.getWins() + " побед(ы)");
        System.out.println(player2.getName() + ": " + player2.getWins() + " побед(ы)");
    }
}
