package com.varaxina.module6.middle2;
import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        Player player = new Player(name, 'X');
        Player computer = new Player("Компьютер", 'O');

        Game game = new Game(player, computer);

        System.out.println("Игра началась! Вы ходите первым.");
        game.printBoard();

        while (true) {
            System.out.print("Введите номер ячейки (1-9): ");
            int cell = scanner.nextInt();
            if (!game.playerMove(cell)) {
                continue;
            }
            game.printBoard();

            if (game.checkWin(player.getSymbol())) {
                System.out.println(player.getName() + " победил!");
                break;
            }
            if (game.isBoardFull()) {
                System.out.println("Ничья!");
                break;
            }

            game.computerMove();
            game.printBoard();

            if (game.checkWin(computer.getSymbol())) {
                System.out.println(computer.getName() + " победил!");
                break;
            }
            if (game.isBoardFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        scanner.close();
    }
}
