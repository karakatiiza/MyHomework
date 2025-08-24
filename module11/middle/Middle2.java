package com.varaxina.module11.middle;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");

        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        Set<Integer> unique = new HashSet<>();

        for (String part : parts) {
            unique.add(Integer.parseInt(part));
        }

        System.out.println("Количество различных чисел: " + unique.size());
    }
}
