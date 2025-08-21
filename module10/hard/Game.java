package com.varaxina.module10.hard;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Character[] heroes = {new Character("Стрелок", 90, new Gun()),
                            new Character("Рыцарь", 100, new Sword()),
                            new Character("Воин", 110, new Spear())};
    Character[] villains = {new Character("Бандит", 100, new Gun()),
                            new Character("Гладиатор", 110, new Sword()),
                            new Character("Браконьер", 120, new Spear())};

    public void start() {
        System.out.println("Добро пожаловать, Игрок! Тебе предстоит сразиться с врагом.");
        System.out.print("Твой противник: ");
        Character enemy = villains[(int) (Math.random()*3)];
        System.out.println(enemy.getName() + " (" + enemy.getHealth()
                            + " HP, использует " + enemy.weapon.getName() + ")");
        System.out.println("Выбери героя:");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i + 1) + ". " + heroes[i].getName() + ", (" + heroes[i].getHealth() +
                    " HP, использует " + heroes[i].weapon.getName() + ")");
        }
        int choice = scanner.nextInt() - 1;
        Character hero = heroes[choice];

        System.out.println("Бой начинается!");
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attack(enemy);
            if (!enemy.isAlive()) {
                System.out.println();
                break;
            }
            enemy.attack(hero);
            System.out.println(hero.getName() + ": " + hero.getHealth() + " HP");
            System.out.println(enemy.getName() + ": " + enemy.getHealth() + " HP");
            System.out.println();
        }

        if (hero.isAlive()) {
            System.out.println(enemy.getName() + " повержен... Поздравляю! Ты победил!");
        } else {
            System.out.println("Ты проиграл...");
        }
    }
}
