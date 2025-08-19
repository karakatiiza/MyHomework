package com.varaxina.module9;

public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    protected void deposit(int amount) {
        balance += amount;
    }

    protected void withdraw(int amount) {
        balance -= amount;
    }
}

