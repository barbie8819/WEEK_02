package BankingSystem;

import java.util.List;

public class Main {
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Processing account: " + account.getAccountNumber());
            System.out.println("Holder: " + account.getHolderName());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("Calculated Interest: $" + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                double loanEligibility = loanable.calculateLoanEligibility();
                System.out.println("Loan Eligibility: $" + loanEligibility);

                boolean loanApproved = loanable.applyForLoan(5000);
                System.out.println("Loan Approval: " + (loanApproved ? "Approved" : "Denied"));
            }

            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        BankAccount savings = new SavingAccount("SAV123", "Alice Johnson", 10000);
        BankAccount current = new CurrentAccount("CUR456", "Bob Smith", 3000);

        savings.deposit(2000);
        current.withdraw(500);

        List<BankAccount> accounts = List.of(savings, current);
        processAccounts(accounts);
    }
}
