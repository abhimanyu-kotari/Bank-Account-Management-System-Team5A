package com.team5a.bank;

import java.util.UUID;

/**
 * Abstract base class for bank accounts.
 */
public abstract class Account {
    protected final String accountNumber;
    protected final Customer owner;
    protected double balance;

    public Account(Customer owner) {
        this.accountNumber = UUID.randomUUID().toString();
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
    }

    public abstract String getAccountType();
}
