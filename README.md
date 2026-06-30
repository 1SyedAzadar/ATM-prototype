# ATM Management System

A console-based ATM simulation built in Java, demonstrating practical application of Object-Oriented Programming concepts, collections, and exception handling.

## Features

- Multiple bank accounts managed via HashMap for fast lookup
- Account number based login system
- PIN verification with 3-attempt security limit
- Account blocking after repeated failed attempts
- Real-time display of remaining PIN attempts
- Deposit, Withdraw, and Check Balance operations
- Input validation with custom exception handling
- Continuous session loop — supports multiple users without restarting the program
- Clean logout flow returning to the account selection screen

## OOP Concepts Used

- **Encapsulation** — Account details (PIN, balance) are private, accessed only through methods
- **HashMap** — Used for fast account lookup by account number instead of looping through a list
- **Exception Handling** — Custom validation for negative amounts and insufficient funds using `IllegalArgumentException`
- **Separation of Concerns** — `Accounts` class handles account logic, `Bank` class manages the collection of accounts, `ATM` class handles user interaction

## Project Structure

```
Accounts.java   -> Account class with deposit, withdraw, PIN verification logic
Bank.java       -> Manages all accounts using HashMap
ATM.java        -> Main class with user interaction loop
```

## How to Run

1. Clone the repository
2. Open the project in your IDE (e.g., VS Code, IntelliJ)
3. Run `ATM.java`
4. Enter an account number (e.g., 123, 789, 819, 913, 1013)
5. Enter the corresponding 4-digit PIN
6. Choose from Deposit, Withdraw, Check Balance, or Logout

## Sample Accounts (For Testing)

| Account Number | PIN | Holder Name |
|----------------|-----|--------------|
| 123 | 345 | Azadar Hussain |
| 789 | 702 | Hanan Umrani |
| 819 | 890 | Adil Soomro |
| 913 | 970 | Hamza Dp |
| 1013 | 670 | Saif Ali Samo |

## Security Features

- Maximum 3 PIN attempts before account is temporarily blocked
- Displays remaining attempts after each wrong PIN entry
- Prevents negative deposits and over-withdrawals through exception handling

## What I Learned

- How to use HashMap for efficient data lookup instead of looping through a list
- Designing a multi-attempt security system using a boolean flag combined with a for loop
- Structuring an infinite session loop (`while(true)`) that properly resets for the next user after logout
- Applying custom exceptions to enforce business rules (no negative amounts, no overdrafts)
- The importance of separating responsibilities across classes (Account logic vs Bank management vs User interaction)
