import java.util.Scanner;

public class BankAccountClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bank name:");
        String bankName = sc.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter bank account number:");
        String accountNumber = sc.nextLine();

        // Creating an account object
        BankAccount obj = new BankAccount(bankName, accountHolderName, accountNumber);
        obj.display();

        System.out.println("Total number of accounts in the bank: " + BankAccount.getTotalAccounts());

        sc.close();  // Close the scanner to prevent resource leaks
    }
}

class BankAccount {
    private Static String  bankName;  // Removed static to make it instance-specific
    private String accountHolderName;
    private final String accountNumber;
    private static int totalAccounts = 0;  // Tracks total accounts across all instances

    public BankAccount(String bankName, String accountHolderName, String accountNumber) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public void display() {
        System.out.println("Bank name: " + this.bankName);
        System.out.println("Bank account holder name: " + this.accountHolderName);
        System.out.println("Account number: " + this.accountNumber);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
