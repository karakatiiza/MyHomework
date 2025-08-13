package com.varaxina.module6.middle3;
import java.util.Random;
import java.util.Scanner;

public class Game {
    int sticks;
    Player player;
    Player computer;
    Random random;
    Scanner scanner;

    public Game(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
        this.sticks = 20;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    private void printSticks() {
        for (int i = 0; i < sticks; i++) {
            System.out.print("|");
        }
        System.out.println(" (" + sticks + ")");
    }

    private void playerMove() {
        int remove;
        while (true) {
            System.out.print(player.getName() + ", введите количество палочек (1-3): ");
            if (scanner.hasNextInt()) {
                remove = scanner.nextInt();
                if (remove >= 1 && remove <= 3 && remove < sticks) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ход! Попробуйте снова.");
        }
        sticks -= remove;
    }

    private void computerMove() {
        int remove = random.nextInt(3) + 1;
        if (remove >= sticks) {
            remove = sticks - 1;
        }
        System.out.println(computer.getName() + " убрал " + remove + " палочек.");
        sticks -= remove;
    }

    public void start() {
        System.out.println("Игра началась! Всего палочек: " + sticks);
        printSticks();

        while (sticks > 1) {
            playerMove();
            printSticks();
            if (sticks == 1) {
                System.out.println(player.getName() + " победил!");
                break;
            }

            computerMove();
            printSticks();
            if (sticks == 1) {
                System.out.println(computer.getName() + " победил!");
                break;
            }
        }
    }
}
