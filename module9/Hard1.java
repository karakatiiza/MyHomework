package com.varaxina.module9;

public class Hard1 {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);

        bank.createAccount("Кира", 400);
        bank.createAccount("Илья", 500);
        bank.createAccount("Пётр", 200);

        bank.showAccounts();

        Account kira = bank.getAccounts().get(0);
        Account ilya = bank.getAccounts().get(1);

        bank.transfer(kira, ilya, 100);

        bank.showAccounts();
    }
}
