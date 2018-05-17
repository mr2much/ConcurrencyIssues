package com.lockward.anubis;

public class BankAccount {
    private int balance;

    public int getBalance() { return balance; }

    public BankAccount(int startingBalance) {
        balance = startingBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}
