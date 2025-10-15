package com.team5a.bank;

import java.time.LocalDateTime;

/**
 * Represents a bank transaction.
 */
public class Transaction {
    public enum Type { DEPOSIT, WITHDRAWAL, TRANSFER }

    private final Type type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final String accountNumber;

    public Transaction(Type type, double amount, Account account) {
        this.type = type;
        this.amount = amount;
        this.accountNumber = account.getAccountNumber();
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public Type getType() { return type; }
    public double getAmount() { return amount; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getAccountNumber() { return accountNumber; }

    @Override
    public String toString() {
        return timestamp + " | " + type + " | " + amount + " | Account: " + accountNumber;
    }
}
