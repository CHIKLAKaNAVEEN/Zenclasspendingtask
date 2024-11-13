package Task6;

public class Accounts {
    private double balance;

    // Default constructor (initial balance is 0)
    public Accounts() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public Accounts(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
