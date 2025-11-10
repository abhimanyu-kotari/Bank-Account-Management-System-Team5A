package com.team5a.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bank that manages multiple accounts.
 */
public class Bank {
    private final String name;
    private final List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("New " + account.getAccountType() + " created for " + account.getOwner().getName());
    }

    public void listAccounts() {
        System.out.println("\n=== " + name + " Accounts ===");
        for (Account acc : accounts) {
            System.out.println(acc.getOwner().getName() + " | " + acc.getAccountType() + " | Balance: ₹" + acc.getBalance());
        }
        System.out.println("===============================");
    }
}
