package RideHailingApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("CAR123", "John Doe", 15.0));
        rides.add(new Bike("BIKE456", "Alice Smith", 10.0));
        rides.add(new Auto("AUTO789", "Bob Brown", 12.0));

        double distance = 10.0;
        for (Vehicle ride : rides) {
            System.out.println(ride.getVehicleDetails() + ", Fare: " + ride.calculateFare(distance));
        }
    }
}
