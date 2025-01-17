import java.util.Scanner;

public class BookClass {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 7
        Book book = new Book("Ek Kahani " , "Zensiii" , 10000);

        // Display area details
        book.display();
    }
}

class Book {
    private String title;
    private String author;
    private int price;

    // Constructor
    public Book(String title,String author,int price) {
        this.title=title;
		        this.author=author;
        this.price=price;

    }

  

    // Method to display the details
    public void display() {
        System.out.println("Title of the book : " + this.title);
           System.out.println("author of the book : " + this.author);
        System.out.println("price of the book : " + this.price);

   }
}
