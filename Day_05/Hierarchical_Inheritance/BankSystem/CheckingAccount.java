package BankSystem;

public class CheckingAccount extends BankAccount{
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds the limit of $" + withdrawalLimit);
        }
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
