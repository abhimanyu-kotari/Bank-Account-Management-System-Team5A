package com.team5a.bank;

/**
 * Represents a current account.
 */
public class CurrentAccount extends Account {

    public CurrentAccount(Customer owner) {
        super(owner);
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

    @Override
    public void withdraw(double amount) {
        // Current accounts can go negative up to a limit (say ₹5000)
        double overdraftLimit = 5000.0;

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (amount > balance + overdraftLimit) {
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }

        balance -= amount;
        System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
    }
}
