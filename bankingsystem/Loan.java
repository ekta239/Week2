package packages.bankingsystem;

// Loan class implementing Loanable interface
class Loan implements Loanable {
    private String loanId;
    private String borrowerName;
    private double loanAmount;
    private double interestRate;
    private int loanTerm; // in years

    // Constructor
    public Loan(String loanId, String borrowerName, double loanAmount, double interestRate, int loanTerm) {
        this.loanId = loanId;
        this.borrowerName = borrowerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }

    // Getter and Setter methods for encapsulation
    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // Implementing methods from Loanable interface
    @Override
    public void applyForLoan() {
        System.out.println("Applying for loan: " + loanId);
        // Logic to apply for a loan
    }

    @Override
    public double calculateLoanEligibility() {
        // Simplified loan eligibility calculation based on loan amount and interest rate
        return loanAmount * (1 + interestRate / 100);
    }
    
    // Method to calculate monthly installment
    public double calculateMonthlyInstallment() {
        double monthlyInterestRate = interestRate / 100 / 12;
        int numberOfPayments = loanTerm * 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }
}