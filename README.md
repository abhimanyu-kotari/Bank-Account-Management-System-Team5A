# Bank Account Management System (BAMS) - Team 5A

## Project Overview
This project is a console-based application designed to manage core banking operations, including customer creation, account management, deposits, and withdrawals.

## Technology Stack
* **Language:** Java 17+
* **Build Tool:** Maven or Gradle (TBD)
* **Version Control:** Git / GitHub

## Object-Oriented Design Principles Applied
1.  **Abstraction & Polymorphism:** Using an abstract `Account` class to define common behavior, with concrete subclasses (`SavingsAccount`, `CheckingAccount`) implementing specific logic.
2.  **Encapsulation:** Protecting data integrity by making fields private and using controlled accessors/mutators.
3.  **Single Responsibility Principle (SRP):** Ensuring each class (e.g., `Customer`, `Account`, `Bank`) has one primary responsibility.

## Initial Class Structure
* `com.team5a.bank.Account` (Abstract)
* `com.team5a.bank.SavingsAccount`
* `com.team5a.bank.CheckingAccount`
* `com.team5a.bank.Customer`
* `com.team5a.bank.Bank` (or `BankManager`)

## Getting Started
(To be filled in after the initial code push, including compilation and execution instructions.)
