public class HotelBookingClass{
    // Main method to demonstrate the constructors and display method
    public static void main(String[] args) {
        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.display();

        // Using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        customBooking.display();

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.display();
    }
	}
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display method
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

}

