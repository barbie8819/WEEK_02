package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% extra charge for heavy load
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance [Confidential Policy]";
    }
}
