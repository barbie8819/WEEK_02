import java.util.Scanner;

public class BankAccountClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for account details
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();

        

        // Create a BankAccount object with the entered attributes
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber);

        // Perform operations
		        System.out.println("\nEnter the amount to deposit :");
             int amount = input.nextInt();
        System.out.println("\nPerforming Withdrawal of ..." + amount );
        bankAccount.withdraw(amount);
		        bankAccount.display();

    System.out.println("\nEnter the amount to deposit :");
             int amountt = input.nextInt();
        System.out.println("\nPerforming Deposit of ..." + amountt);
        bankAccount.deposit(amountt);

        // Display BankAccount details
        System.out.println("\nBank Account Details:");
        bankAccount.display();

        input.close();
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private static double balance = 100000;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        }
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }
}
