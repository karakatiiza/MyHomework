package com.varaxina.module5;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] indexes = new int[1001];

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            indexes[number] = 1;
        }

        System.out.println("Уникальные элементы:");
        for (int i = 1; i <= 1000; i++) {
            if (indexes[i] == 1) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

