import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         for(int i=0;i<2;i++){
        // Input movie name and base price
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Base Ticket Price: ");
        double basePrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, basePrice);

        // Book a ticket
        System.out.print("\nEnter Seat Number to Book: ");
        String seatNumber = scanner.nextLine();
        ticket.bookTicket(seatNumber);

        // Display ticket details
        System.out.println("\nTicket Details:");
        ticket.displayTicketDetails();
		 }
        scanner.close();
    }
}

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber) {
        if (isBooked) {
            System.out.println("Ticket is already booked for Seat: " + this.seatNumber);
        } else {
            this.seatNumber = seatNumber;
            isBooked = true;
            System.out.println("Ticket booked successfully for Seat: " + this.seatNumber);
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + String.format("%.2f", price));
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }
}
