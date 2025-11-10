package com.team5a.bank;

/**
 * Main driver class to test bank account functionality.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Team5A Bank");

        Customer c1 = new Customer("Abhimanyu Kotari");

        SavingsAccount savings = new SavingsAccount(c1);
        CurrentAccount current = new CurrentAccount(c1);

        bank.addAccount(savings);
        bank.addAccount(current);

        System.out.println("--------------------------------------");

        // Test Savings Account
        System.out.println("Testing Savings Account:");
        savings.deposit(5000);
        savings.withdraw(1200);
        System.out.println("Final balance: ₹" + savings.getBalance());
        System.out.println("--------------------------------------");

        // Test Current Account
        System.out.println("Testing Current Account:");
        current.deposit(2000);
        current.withdraw(6000); // overdraft test
        System.out.println("Final balance: ₹" + current.getBalance());

        // List all accounts at the end
        bank.listAccounts();
    }
}
