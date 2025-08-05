package com.varaxina.module4;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выбери фигуру:");
        System.out.println("1 - Прямоугольник");
        System.out.println("2 - Тругольник");
        System.out.println("3 - Круг");
        System.out.println("Выбери номер: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Введите длину прямоугольника: ");
                double length = scanner.nextDouble();
                System.out.println("Введите ширину прямоугольника: ");
                double width = scanner.nextDouble();
                double rectangelArea = length * width;
                System.out.println("Площадь прямоугольника: " + rectangelArea);
                break;

            case 2:
                System.out.println("Введите длину основания треугольника: ");
                double base = scanner.nextDouble();
                System.out.println("Введите высоту треугольника: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Площадь треугольника: " + triangleArea);
                break;

            case 3:
                System.out.println("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Площадь круга: " + circleArea);
                break;

            default:
                System.out.println("Некорректный ввод.");
                break;
        }

        scanner.close();
    }
}
