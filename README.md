# 🏦 Bank Account Management System – Team 5A

## 📘 Overview
This project is a **Java-based Bank Account Management System** that demonstrates core Object-Oriented Programming (OOP) concepts while simulating simple banking operations.  
It supports multiple account types, customer creation, deposits, withdrawals, and overdraft behavior.

---

## 👥 Team Members

| Member | Contribution |
|--------|--------------|
| Abhimanyu Kotari | Lead Developer, Git Maintainer |
| Aniketh | Developer |
| Kushal S | Tester |
| Chethan | Documentation |

---

## 🧱 Project Structure

Bank-Account-Management-System-Team5A/
│
├── src/com/team5a/bank/
│ ├── Account.java
│ ├── SavingsAccount.java
│ ├── CurrentAccount.java
│ ├── Customer.java
│ └── Main.java
│
├── .gitignore
└── README.m


> ✅ Only Java source files. No compiled `.class` files or build/output folders in the repo.

---

## 🧠 Object-Oriented Concepts Demonstrated

- **Abstraction:** `Account` is an abstract class defining shared behavior (deposit, withdraw, getBalance).  
- **Inheritance:** `SavingsAccount` and `CurrentAccount` extend `Account`.  
- **Polymorphism:** `withdraw()` is overridden (e.g., CurrentAccount supports overdraft).  
- **Encapsulation:** Fields like `balance`, `owner`, and `accountNumber` are private and exposed via getters/methods.

---

## 🚀 How to Compile & Run

1. Clone the repository:
```bash
git clone https://github.com/abhimanyu-kotari/Bank-Account-Management-System-Team5A.git
cd Bank-Account-Management-System-Team5A

Compile all Java sources:
javac src/com/team5a/bank/*.java

Run the program (from project root):
java com.team5a.bank.Main

if you compiled into a separate out folder, ensure you run with the correct classpath, e.g.:
javac -d out src/com/team5a/bank/*.java
java -cp out com.team5a.bank.Main

🧪 Sample Console Output
New Savings Account created for Abhimanyu Kotari
New Current Account created for Abhimanyu Kotari
--------------------------------------
Testing Savings Account:
Deposited ₹5000. New balance: ₹5000.0
Withdrew ₹1200. New balance: ₹3800.0
Final balance: ₹3800.0
--------------------------------------
Testing Current Account:
Deposited ₹2000. New balance: ₹2000.0
Withdrew ₹6000. New balance: ₹-4000.0
Final balance: ₹-4000.0

=== Team5A Bank Accounts ===
Abhimanyu Kotari | Savings Account | Balance: ₹3800.0
Abhimanyu Kotari | Current Account | Balance: ₹-4000.0
=================================


🔮 Future Enhancements

Add interest calculation for savings accounts

Maintain transaction history (separate Transaction class)

Implement simple authentication (username/password)

Persist data to a database (MySQL / PostgreSQL)

Build GUI (JavaFX) or Web UI (Spring Boot)
