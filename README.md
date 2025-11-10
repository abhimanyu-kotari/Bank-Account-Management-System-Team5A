# 🏦 Bank Account Management System (Team 5A)

### 📘 Overview
This Java-based project is a **Bank Account Management System** that allows customers to create and manage different types of bank accounts.  
It demonstrates key **Object-Oriented Programming (OOP)** concepts such as inheritance, abstraction, polymorphism, and encapsulation, while simulating real-world banking operations.

---

### 👥 Team Members
| Name | Role |
|------|------|
| Abhimanyu Kotari | Lead Developer & Git Maintainer |
| Aniketh | Developer |
| Kushal S | Tester |
| Chethan | Documentation |

---

### 🏗️ Project Structure

Bank-Account-Management-System-Team5A/
│
├── src/com/team5a/bank/
│ ├── Account.java
│ ├── SavingsAccount.java
│ ├── CurrentAccount.java
│ ├── Customer.java
│ ├── Transaction.java
│ └── Main.java
│
├── .gitignore
└── README.md


---

### 🧠 Concepts Used
- **Abstraction:** `Account` is an abstract class defining core banking behavior.  
- **Inheritance:** `SavingsAccount` and `CurrentAccount` extend `Account`.  
- **Encapsulation:** Account details are protected within classes.  
- **Polymorphism:** Dynamic method overriding for deposit/withdraw behavior.  

---

### 🚀 How to Run the Project
#### 1. Clone the Repository
```bash
git clone https://github.com/abhimanyu-kotari/Bank-Account-Management-System-Team5A.git
cd Bank-Account-Management-System-Team5A

**#Compile the Code**
javac src/com/team5a/bank/*.java

**Run the Application**
java src/com/team5a/bank/Main

🧩 Example Output

Welcome to Team5A Bank!
Creating account for Abhimanyu Kotari...
Deposit successful: ₹5000
Withdrawal successful: ₹1500
Current Balance: ₹3500
Transaction History:
1. Deposit ₹5000
2. Withdrawal ₹1500

💡 Future Enhancements

Add interest calculation for savings accounts

Implement user authentication

Integrate database (MySQL or PostgreSQL)

Add GUI or Web interface using JavaFX or Spring Boot
