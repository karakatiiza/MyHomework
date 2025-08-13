package com.varaxina.module6.middle2;

import java.util.Random;

public class Game {
    char[] board;
    Player player;
    Player computer;
    Random random;

    public Game(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
        this.board = new char[9];
        this.random = new Random();
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
    }

    public void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public boolean playerMove(int cell) {
        if (cell < 1 || cell > 9 || board[cell - 1] != ' ') {
            System.out.println("Некорректный ход! Попробуйте снова.");
            return false;
        }
        board[cell - 1] = player.getSymbol();
        return true;
    }

    public void computerMove() {
        int cell;
        do {
            cell = random.nextInt(9);
        } while (board[cell] != ' ');
        board[cell] = computer.getSymbol();
        System.out.println(computer.getName() + " выбрал ячейку " + (cell + 1));
    }

    public boolean checkWin(char s) {
        return
                (board[0] == s && board[1] == s && board[2] == s) ||
                        (board[3] == s && board[4] == s && board[5] == s) ||
                        (board[6] == s && board[7] == s && board[8] == s) ||
                        (board[0] == s && board[3] == s && board[6] == s) ||
                        (board[1] == s && board[4] == s && board[7] == s) ||
                        (board[2] == s && board[5] == s && board[8] == s) ||
                        (board[0] == s && board[4] == s && board[8] == s) ||
                        (board[2] == s && board[4] == s && board[6] == s);
    }

    public boolean isBoardFull() {
        for (char c : board) {
            if (c == ' ') return false;
        }
        return true;
    }
}

