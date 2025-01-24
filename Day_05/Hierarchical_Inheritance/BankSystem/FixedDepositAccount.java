package BankSystem;

public class FixedDepositAccount extends BankAccount{
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayMaturityDetails() {
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
