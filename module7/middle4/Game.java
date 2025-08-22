package com.varaxina.module7.middle4;

public class Game {
    Frog frog1;
    Frog frog2;
    Dice dice;

    public Game(String name1, String name2) {
        frog1 = new Frog(name1);
        frog2 = new Frog(name2);
        dice = new Dice();
    }

    public void start() {
        System.out.println("Игра 'Лягушки'. Побеждает тот, кто первым сделает 30 прыжков!");

        boolean gameOver = false;
        while (!gameOver) {
            int roll1 = dice.roll();
            frog1.jump(roll1);
            if (frog1.getJumpCount() >= 30) {
                System.out.println("-------------------");
                System.out.println();
                System.out.println(frog1.getName() + " победила!");
                break;
            }

            int roll2 = dice.roll();
            frog2.jump(roll2);
            if (frog2.getJumpCount() >= 30) {
                System.out.println("-------------------");
                System.out.println();
                System.out.println(frog2.getName() + " победила!");
                gameOver = true;
            }

            System.out.println("-------------------");
        }
    }
}
