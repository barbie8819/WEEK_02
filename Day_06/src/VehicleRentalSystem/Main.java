package VehicleRentalSystem;

import java.util.List;

public class Main {
    public static void calculateCosts(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;
            String insuranceDetails = "Not Insurable";

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
                insuranceDetails = ((Insurable) vehicle).getInsuranceDetails();
            }

            System.out.println("Vehicle: " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + days + " days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost);
            System.out.println("Insurance Details: " + insuranceDetails);
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", 50.0, "CAR-INS-001");
        Vehicle bike = new Bike("BIKE456", 20.0, "BIKE-INS-002");
        Vehicle truck = new Truck("TRUCK789", 100.0, "TRUCK-INS-003");

        List<Vehicle> vehicles = List.of(car, bike, truck);
        calculateCosts(vehicles, 5);
    }
}
