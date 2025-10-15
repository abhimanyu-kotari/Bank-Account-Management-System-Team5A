package com.team5a.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Abstract base class for bank accounts.
 */
public abstract class Account {
    protected final String accountNumber;
    protected final Customer owner;
    protected double balance;
    protected final List<Transaction> transactions = new ArrayList<>();

    public Account(Customer owner) {
        this.accountNumber = UUID.randomUUID().toString();
        this.owner = owner;
        this.balance = 0.0;
    }

    // Abstract method to return account type
    public abstract String getAccountType();

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be > 0");
        balance += amount;
        transactions.add(new Transaction(Transaction.Type.DEPOSIT, amount, this));
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
        transactions.add(new Transaction(Transaction.Type.WITHDRAWAL, amount, this));
    }

    // Helper method to allow Bank to add transfer transactions
    protected void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public Customer getOwner() { return owner; }
    public double getBalance() { return balance; }

    // Return immutable list to external code
    public List<Transaction> getTransactions() { return List.copyOf(transactions); }
}
