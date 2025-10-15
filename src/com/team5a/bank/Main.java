package com.team5a.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create customers
        Customer c1 = bank.createCustomer("C001", "Abhimanyu Kotari", "abhimanyu@example.com", "9876543210");
        Customer c2 = bank.createCustomer("C002", "John Doe", "john@example.com", "1234567890");

        System.out.println("Customers created:");
        System.out.println(c1);
        System.out.println(c2);

        // Create accounts
        Account savings = bank.createSavingsAccount(c1, 0.03); // 3% interest
        Account current = new CurrentAccount(c2, 2000); // overdraft 2000
        bank.getAccount(current.getAccountNumber()); // add to accounts map
        bank.getAccount(savings.getAccountNumber());

        System.out.println("\nAccounts created:");
        System.out.println(savings.getAccountNumber() + " | Type: " + savings.getAccountType());
        System.out.println(current.getAccountNumber() + " | Type: " + current.getAccountType());

        // Deposit
        savings.deposit(5000);
        current.deposit(1000);

        // Withdraw
        savings.withdraw(1500);
        current.withdraw(2500); // uses overdraft

        // Transfer
        bank.transfer(savings, current, 500);

        // Print balances
        System.out.println("\nBalances after transactions:");
        System.out.println(savings.getAccountType() + " " + savings.getAccountNumber() + ": " + savings.getBalance());
        System.out.println(current.getAccountType() + " " + current.getAccountNumber() + ": " + current.getBalance());

        // Print transaction histories
        System.out.println("\nTransaction history (Savings):");
        for (Transaction t : savings.getTransactions()) System.out.println(t);

        System.out.println("\nTransaction history (Current):");
        for (Transaction t : current.getTransactions()) System.out.println(t);
    }
}
