package BankSystem;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("Interest applied. New Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
