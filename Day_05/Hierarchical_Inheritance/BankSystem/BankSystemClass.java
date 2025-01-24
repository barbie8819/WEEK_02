package BankSystem;

public class BankSystemClass {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000, 12);

        // Display account types
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();

        // Perform operations
        savings.deposit(1000);
        savings.applyInterest();
        savings.displayBalance();

        checking.withdraw(500);
        checking.withdraw(1500);
        checking.displayBalance();

        fixedDeposit.displayMaturityDetails();
        fixedDeposit.displayBalance();
    }
}
