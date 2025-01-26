package packages.vehiclerentalsystem;


class InsuredVehicle extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public InsuredVehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateInsurance() {
        // Some insurance calculation logic
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }
}