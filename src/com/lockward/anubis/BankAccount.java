package com.lockward.anubis;

public class BankAccount {
    private int balance;

    public synchronized int getBalance() { return balance; }

    public BankAccount(int startingBalance) {
        balance = startingBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }
}
