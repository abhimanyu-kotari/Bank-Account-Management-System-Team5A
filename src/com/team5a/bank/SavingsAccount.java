package com.team5a.bank;

// Inheritance: SavingsAccount extends Account
public class SavingsAccount extends Account {

    public SavingsAccount(Customer owner) {
        super(owner);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }

    // Polymorphism: overriding withdraw logic
    @Override
    public void withdraw(double amount) {
        double minBalance = 500;

        if (getBalance() - amount < minBalance) {
            throw new IllegalArgumentException("Minimum ₹500 must remain in savings account");
        }

        super.withdraw(amount);
    }
}
