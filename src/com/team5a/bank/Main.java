package com.team5a.bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Team5A Bank");

        Customer c1 = new Customer("Abhimanyu Kotari");

        // Polymorphism: reference as Account
        Account savings = new SavingsAccount(c1);
        Account current = new CurrentAccount(c1);

        bank.addAccount(savings);
        bank.addAccount(current);

        System.out.println("------------------------------");

        System.out.println("Testing Savings Account:");
        try {
            savings.deposit(5000);
            savings.withdraw(1200);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("------------------------------");

        System.out.println("Testing Current Account:");
        try {
            current.deposit(2000);
            current.withdraw(6000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        bank.listAccounts();
    }
}
