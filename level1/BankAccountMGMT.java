class BankAccount {
    // Publicly accessible account number
    public int accountNumber;
    // Protected account holder name, accessible within the class and its subclasses
    protected String accountHolder;
    // Private balance, accessible only within the class
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to retrieve the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit a specified amount into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    // Constructor to initialize the savings account
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display the account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Main class to manage bank accounts
public class BankAccountMGMT{
    // Main method to test the bank account functionality
    public static void main(String[] args) {
        // Create a new savings account
        SavingsAccount sa = new SavingsAccount(12345, "John Doe", 1000. * 1000  );
        // Display the account information
        sa.displayAccountInfo();
    }
}