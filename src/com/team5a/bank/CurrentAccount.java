package com.team5a.bank;

public class CurrentAccount extends Account {
    private final double overdraftLimit;

    public CurrentAccount(Customer owner, double overdraftLimit) {
        super(owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountType() {
        return "CURRENT";
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
        if (balance - amount < -overdraftLimit) {
            throw new IllegalArgumentException("Insufficient funds (Overdraft limit reached)");
        }
        balance -= amount;
        transactions.add(new Transaction(Transaction.Type.WITHDRAWAL, amount, this));
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
