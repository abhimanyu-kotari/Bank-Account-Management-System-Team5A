package com.team5a.bank;

/**
 * Represents a savings account.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(Customer owner) {
        super(owner);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
lmkm