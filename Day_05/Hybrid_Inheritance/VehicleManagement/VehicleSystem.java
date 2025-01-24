package VehicleManagement;

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display Electric Vehicle info and charge
        ev.displayInfo();
        ev.charge();

        System.out.println();

        // Display Petrol Vehicle info and refuel
        pv.displayInfo();
        pv.refuel();
    }
}
