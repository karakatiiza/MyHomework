package com.varaxina.module4;
import java.util.Scanner;

public class CheckAttack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите позицию слона: ");
        char bishopX = scanner.next().charAt(0);
        int bishopY = scanner.nextInt();
        System.out.println("Введите позицию пешни: ");
        char pawnX = scanner.next().charAt(0);
        int pawnY = scanner.nextInt();

        int dx = Math.abs(bishopX - pawnX);
        int dy =  Math.abs(bishopY - pawnY);

        if (dx == dy) {
            System.out.println("Пешка находится под боем слона.");
        } else {
            System.out.println("Пешка не находится под боем слона.");
        }
        scanner.close();
    }
}
