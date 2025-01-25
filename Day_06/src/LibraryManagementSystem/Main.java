package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Java Programming", "John Doe");
        LibraryItem magazine = new Magazine("M001", "Tech Today", "Jane Smith");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        System.out.println(book.getItemDetails() + ", Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + ", Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + ", Loan Duration: " + dvd.getLoanDuration() + " days");

        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem();
        System.out.println("Book availability: " + reservableBook.checkAvailability());
    }
}
