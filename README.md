# 💰 BankApp - Java Console Bank Management System

BankApp is a simple console-based banking application written in Java. It allows users to create customer accounts, deposit and withdraw funds, and view account details. This project is designed for beginners to understand object-oriented programming, basic Java syntax, and modular code design.

---

## 📁 Project Structure

BankApp/ ├── src/ │ ├── main/java/com/bankapp/ │ │ ├── model/ # Account & Customer models │ │ ├── service/ # Core banking logic │ │ ├── util/ # Input helper │ │ └── App.java # Main class │ └── test/java/com/bankapp/service/ │ └── BankServiceTest.java ├── pom.xml # Maven build configuration └── README.md

# Compile and run the app:

mvn clean compile
mvn exec:java -Dexec.mainClass="com.bankapp.App"

# Run tests:

mvn test

# Features:

Create a new customer with an account

Deposit money into an account

Withdraw money from an account

View account details (name, balance)

Console-based interaction using helper utilities

Unit-tested core service logic using JUnit 5

# Technologies Used
Java 17

Maven

JUnit 5

VS Code