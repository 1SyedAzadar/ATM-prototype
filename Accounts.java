import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Accounts {

    private int accountNumber;
    private int pin;
    private double balance;
    private String holdersName;


    Accounts(int accountNumber, int pin, double balance, String holdersName) {

        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.holdersName = holdersName;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public int getPin() {
        return this.pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else {
            this.balance = balance + amount;
        }

    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Funds");
        } else {
            this.balance = balance - amount;
        }
    }

    public void balanceInfo() {

        System.out.println("Current Balance = " + this.getBalance());
    }
}

