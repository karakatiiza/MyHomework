package com.varaxina.module6.middle1;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите действие (+, -, *, /): ");
        String operation = scanner.nextLine();

        System.out.print("Введите первый аргумент: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второй аргумент: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Неизвестная операция!");
                scanner.close();
                return;
        }

        System.out.println("Результат: " + result);
        scanner.close();
    }
}
