🏦 Bank Account Management System – Team 5A
📘 Overview

This project is a Java-based Bank Account Management System demonstrating real-world banking operations and core Object-Oriented Programming (OOP) concepts.
It supports multiple account types, customer creation, deposits, withdrawals, and overdraft behavior.

The system is simple, modular, and follows clean OOP principles.

👥 Team Members
Member	Contribution
Abhimanyu Kotari	Lead Developer, GitHub & Code Integration
Aniketh	Logic Implementation & Testing
Kushal S	Code Review & Error Testing
Chethan	Documentation & Presentation
🧱 Project Structure
Bank-Account-Management-System-Team5A/
│
├── src/com/team5a/bank/
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   ├── Customer.java
│   └── Main.java
│
├── .gitignore
└── README.md


✅ Only Java source files
✅ Clean and simple structure
✅ No unnecessary build/output files

🧠 Object-Oriented Concepts Demonstrated
✔ Abstraction

Account is an abstract class defining shared attributes and methods like deposit, withdraw, and getBalance.

✔ Inheritance

SavingsAccount and CurrentAccount extend Account and inherit core behavior.

✔ Polymorphism

withdraw() is overridden in CurrentAccount to support overdraft, showing runtime polymorphism.

✔ Encapsulation

Sensitive data like balance, owner, and accountNumber are protected and accessed via getter methods.

🚀 How to Run the Project
✅ Step 1: Clone the repo
git clone https://github.com/abhimanyu-kotari/Bank-Account-Management-System-Team5A.git
cd Bank-Account-Management-System-Team5A

✅ Step 2: Compile the source code
javac src/com/team5a/bank/*.java

✅ Step 3: Run the application
java com.team5a.bank.Main

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

Add interest calculation to savings accounts

Implement transaction history

Add authentication using usernames/passwords

Add database persistence (MySQL / PostgreSQL)

Create GUI or web-based interface using JavaFX or Spring Boot

✅ Status

✔ Working
✔ Clean OOP design
✔ Ready for presentation and CIE evaluation
