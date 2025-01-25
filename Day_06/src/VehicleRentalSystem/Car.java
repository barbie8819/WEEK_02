package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.05;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance [Confidential Policy]";
    }
}
