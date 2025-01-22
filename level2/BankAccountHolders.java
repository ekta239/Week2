import java.util.List;
import java.util.ArrayList;
class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Bank {
    private String name;
    private List<BankAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
public class BankAccountHolders{
    public static void main(String[] args) {

        Bank bank = new Bank("ABC Bank");
        bank.openAccount("SA123456", 1000.0);
        Customer customer = new Customer("John Doe");
        customer.addAccount(bank.getAccount("SA123456"));
        customer.viewBalance("SA123456");
        
    }
}
