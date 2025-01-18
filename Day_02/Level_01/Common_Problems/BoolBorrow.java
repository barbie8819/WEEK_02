
    // Main method to demonstrate functionality
	public class BoolBorrow{
    public static void main(String[] args) {
        // Creating a book instance
        Book book1 = new Book("1984", "George Orwell", 9.99, true);

        // Display book details
        System.out.println("Book Details:");
        book1.displayDetails();

        // Borrow the book
        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        // Display book details again
        System.out.println("\nUpdated Book Details:");
        book1.displayDetails();

        // Attempt to borrow the book again
        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();
    }
}
public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed: " + title);
            isAvailable = false; // Mark the book as unavailable
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}
