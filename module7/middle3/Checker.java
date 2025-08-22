package com.varaxina.module7.middle3;

public class Checker {
    public String checkWinner(int player, int computer) {
        if (player == computer) {
            return "Ничья";
        } else if ((player == 0 && computer == 1) ||
                (player == 1 && computer == 2) ||
                (player == 2 && computer == 0)) {
            return "Вы выиграли!";
        } else {
            return "Компьютер выиграл!";
        }
    }
}
