# Bank Management System

A simple Bank Management System built in Java to practice and apply core Object-Oriented Programming (OOP) concepts.

## Features

- Create bank accounts with account number, holder name, PIN, and balance
- Deposit and withdraw money with input validation
- Two account types: **Current Account** and **Savings Account**
- Savings Account supports interest calculation based on a custom interest rate
- Demonstrates polymorphism using an array of `BankAccounts` holding different account types

## OOP Concepts Used

- **Encapsulation** — Account details (balance, PIN, etc.) are kept private and accessed only through getter/setter methods
- **Inheritance** — `CurrentAccount` and `SavingsAccount` extend the base `BankAccounts` class
- **Polymorphism** — A `BankAccounts[]` array can hold different account types, and methods behave according to the actual object type at runtime

## Project Structure

```
BankAccounts.java                  -> Contains BankAccounts (parent class), CurrentAccount, and SavingsAccount
SAMO_Bank_Management_system.java   -> Contains the main method to test the system
```

## How to Run

1. Clone the repository
2. Open the project in your IDE (e.g., VS Code, IntelliJ)
3. Run `SAMO_Bank_Management_system.java`

## Sample Output

The program creates multiple accounts, performs deposits and withdrawals, applies interest to a savings account, and displays account information for each account.

## What I Learned

This project helped me understand how to apply OOP principles practically — especially the difference between compile-time (declared) type and run-time (actual) type when working with inheritance and polymorphism.
