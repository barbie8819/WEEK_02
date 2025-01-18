    // Main method for testing
	
public class BookClass{
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Book parameterizedBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        parameterizedBook.displayDetails();
    }
}
public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


   
    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

