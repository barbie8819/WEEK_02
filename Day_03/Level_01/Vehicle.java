public class Vehicle {
    private static double registrationFee = 500.0; // Static variable common to all vehicles
    private final String registrationNumber; // Final variable for unique registration number
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber; // Final variable initialization
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Static method to check if an object is an instance of Vehicle
    public static boolean isVehicle(Object obj) {
        return obj instanceof Vehicle;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Create vehicles
        Vehicle v1 = new Vehicle("John Doe", "Car", "REG123");
        Vehicle v2 = new Vehicle("Jane Smith", "Motorcycle", "REG456");

        // Display details if the object is a Vehicle
        if (Vehicle.isVehicle(v1)) {
            v1.displayDetails();
        }

        if (Vehicle.isVehicle(v2)) {
            v2.displayDetails();
        }

        // Update the registration fee
        Vehicle.updateRegistrationFee(750.0);

        System.out.println("\nAfter Updating Registration Fee:");
        if (Vehicle.isVehicle(v1)) {
            v1.displayDetails();
        }
    }
}