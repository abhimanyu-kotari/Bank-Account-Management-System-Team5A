package com.team5a.bank;

import java.util.*;

public class Bank {
    private final Map<String, Customer> customers = new HashMap<>();
    private final Map<String, Account> accounts = new HashMap<>();

    // Create a new customer
    public Customer createCustomer(String id, String name, String email, String phone) {
        Customer c = new Customer(id, name, email, phone);
        customers.put(id, c);
        return c;
    }

    // Create a savings account for a customer
    public Account createSavingsAccount(Customer customer, double interestRate) {
        Account a = new SavingsAccount(customer, interestRate);
        accounts.put(a.getAccountNumber(), a);
        return a;
    }

    // Create a current account for a customer
    public Account createCurrentAccount(Customer customer, double overdraftLimit) {
        Account a = new CurrentAccount(customer, overdraftLimit);
        accounts.put(a.getAccountNumber(), a);
        return a;
    }

    // Get an account by account number
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // List all accounts
    public List<Account> listAccounts() {
        return new ArrayList<>(accounts.values());
    }

    // List all customers
    public List<Customer> listCustomers() {
        return new ArrayList<>(customers.values());
    }

    // Transfer money from one account to another
    public void transfer(Account from, Account to, double amount) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Invalid account(s) for transfer");
        }
        from.withdraw(amount); // checks balance/overdraft
        to.deposit(amount);

        // Add transfer transactions using helper method in Account
        from.addTransaction(new Transaction(Transaction.Type.TRANSFER, amount, from));
        to.addTransaction(new Transaction(Transaction.Type.TRANSFER, amount, to));
    }
}
