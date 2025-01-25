package BankingSystem;

public class SavingAccount extends BankAccount implements Loanable{
    private final double interestRate = 0.04;  // 4% annual interest

    public SavingAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return getBalance() > 5000 && amount <= getBalance() * 2;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;  // Eligible for loan up to twice the balance
    }
}
