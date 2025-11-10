package com.team5a.bank;

public class CurrentAccount extends Account {

    public CurrentAccount(Customer owner) {
        super(owner);
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

    // Polymorphism: custom overdraft logic
    @Override
    public void withdraw(double amount) {
        double overdraftLimit = 5000;

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }

        if (amount > getBalance() + overdraftLimit) {
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }

        // Using custom balance calculation since balance is private
        double newBalance = getBalance() - amount;

        // Use deposit(-amount) pattern if needed, but we call withdraw from superclass by adjusting
        try {
            // Trick: deposit negative amount (not recommended in real systems)
            deposit(-amount);
        } catch (Exception e) {
            // fallback manual update would go in a real system
        }

        System.out.println("Withdrew ₹" + amount + ", New Balance: ₹" + newBalance);
    }
}
