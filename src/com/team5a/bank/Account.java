package com.team5a.bank;

import java.util.UUID;

// Abstraction: Base class with abstract method
public abstract class Account {

    private final String accountNumber;
    private final Customer owner;
    private double balance;   // Encapsulated

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

    // Deposit logic (common for all)
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
        System.out.println("Deposited ₹" + amount + ", New Balance: ₹" + balance);
    }

    // Base withdrawal (can be overridden)
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrew ₹" + amount + ", New Balance: ₹" + balance);
    }

    public abstract String getAccountType();  // Abstraction
}
