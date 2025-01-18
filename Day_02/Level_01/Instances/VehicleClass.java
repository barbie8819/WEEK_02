import java.util.Scanner;
public class VehicleClass{
   // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for registration fee
        System.out.println("Enter the registration fee:");
        double initialFee = scanner.nextDouble();
        scanner.nextLine(); // Clear the buffer

        // Input for vehicle details
        System.out.println("Enter the owner's name:");
        String ownerName = scanner.nextLine();

        System.out.println("Enter the vehicle type (e.g., Car, Bike):");
        String vehicleType = scanner.nextLine();

        // Create a Vehicle object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, initialFee);

        // Display vehicle details
        System.out.println("\n--- Vehicle Details ---");
        vehicle.displayVehicleDetails();

        // Update the registration fee
        System.out.println("\nEnter a new registration fee to update:");
        double newFee = scanner.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        // Display updated vehicle details
        System.out.println("\n--- Updated Vehicle Details ---");
        vehicle.displayVehicleDetails();

        scanner.close();
    }
}
public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, double registrationFee) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        Vehicle.registrationFee = registrationFee; // Set the initial registration fee
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee has been updated to: $" + registrationFee);
    }

 }
