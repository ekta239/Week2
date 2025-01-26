package packages.bankingsystem;

public class main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("12345", "Alice", 1000, 5);
        BankAccount current = new CurrentAccount("67890", "Bob", 2000, 500);
        Loan loan = new Loan("LN001", "Charlie", 5000, 7, 5);

        // Polymorphism in action
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());

        // Loan application and eligibility
        loan.applyForLoan();
        System.out.println("Loan Eligibility Amount: " + loan.calculateLoanEligibility());
        System.out.println("Monthly Installment: " + loan.calculateMonthlyInstallment());
    }
}