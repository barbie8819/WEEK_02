package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // No extra charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance [Confidential Policy]";
    }
    }
