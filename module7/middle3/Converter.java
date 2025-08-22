package com.varaxina.module7.middle3;

public class Converter {
    public String convertToWord(int choice) {
        return switch (choice) {
            case 0 -> "Камень";
            case 1 -> "Ножницы";
            case 2 -> "Бумага";
            default -> "Некорректный ход";
        };
    }
}
