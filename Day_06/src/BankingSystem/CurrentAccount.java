package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable{
    private final double interestRate = 0.02;  // 2% annual interest
    private final double overdraftLimit = 1000;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= 10000;  // Fixed loan eligibility
    }

    @Override
    public double calculateLoanEligibility() {
        return overdraftLimit + getBalance();
    }
}
