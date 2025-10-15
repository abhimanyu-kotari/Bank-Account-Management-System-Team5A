package com.team5a.bank;

/**
 * Savings account with interest rate.
 */
public class SavingsAccount extends Account {
    private double interestRate; // e.g., 0.03 = 3%

    public SavingsAccount(Customer owner, double interestRate) {
        super(owner);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountType() { return "SAVINGS"; }

    public void applyInterest() {
        double interest = balance * interestRate;
        deposit(interest); // records transaction
    }
}
