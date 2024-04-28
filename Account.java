package task10;

public class Account {
    private double balance;
    
    // No-argument constructor
    public Account() {
        // Default balance is set to 0
        this.balance = 0.0;
    }
    
    // Parameterized constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    
    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    
    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
