package com.varaxina.module9;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int maxBalance;
    private List<Account> accounts;

    public Bank(int maxBalance) {
        this.maxBalance = maxBalance;
        this.accounts = new ArrayList<>();
    }

    public boolean createAccount(String owner, int initialBalance) {
        int totalMoney = getTotalBalance();
        if (totalMoney + initialBalance > maxBalance) {
            System.out.println("Невозможно создать счёт: превышен максимальный баланс банка");
            return false;
        }
        accounts.add(new Account(owner, initialBalance));
        System.out.println("Счёт создан для " + owner + " с балансом " + initialBalance);
        return true;
    }

    private int getTotalBalance() {
        int sum = 0;
        for (Account acc : accounts) {
            sum += acc.getBalance();
        }
        return sum;
    }

    public void transfer(Account from, Account to, int amount) {
        if (!accounts.contains(from) || !accounts.contains(to)) {
            System.out.println("Оба счёта должны принадлежать банку");
            return;
        }
        if (from.getBalance() < amount) {
            System.out.println("Недостаточно денег на счёте " + from.getOwner());
            return;
        }
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Перевод " + amount + " с " + from.getOwner() + " на " + to.getOwner() + " выполнен");
    }

    public void showAccounts() {
        System.out.println("Счета банка:");
        for (Account acc : accounts) {
            System.out.println(acc.getOwner() + " : " + acc.getBalance());
        }
        System.out.println("Суммарный баланс: " + getTotalBalance() + " из " + maxBalance);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

