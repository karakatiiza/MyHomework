package com.varaxina.module5;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов N: ");
        int N = scanner.nextInt();
        scanner.close();

        int first = 0;
        int second = 1;

        System.out.print("Ряд Фибоначчи: ");

        for (int i = 0; i < N; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

