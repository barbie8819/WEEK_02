import java.util.ArrayList;

// Main class
public class BankDemo {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("National Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank.openAccount(customer1, 500.00);
        bank.openAccount(customer1, 1000.00);
        bank.openAccount(customer2, 200.00);

        // Display customers of the bank
        bank.displayCustomers();

        // Customers view their balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}

// Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, initialBalance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    // Display all customers of the bank
    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public String getName() {
        return name;
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View balance of all accounts
    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + '}';
    }
}

// Account class
class Account {
    private Bank bank;
    private double balance;

    // Constructor
    public Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}