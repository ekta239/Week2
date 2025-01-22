class BankAccount {
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static String getBankName() {
        return bankName;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        }
    }
}

public class Bnk {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Abhay",626088);
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBankName());
        System.out.println(account.getTotalAccounts());
    }
}
