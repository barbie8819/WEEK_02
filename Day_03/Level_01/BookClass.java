public class BookClass{
   public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();

        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // Display book details
        book1.displayDetails();
        book2.displayDetails();
    }
}
class Book {
    // Static variable shared across all books
    private static String libraryName = "Central Library";
    
    // Instance variables
    private String title;
    private String author;
    private final String isbn;  // Final variable to ensure immutability

    // Constructor using 'this' keyword to initialize variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details if it's an instance of Book class
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }

 }
