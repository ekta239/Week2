public class VehicleRegistration {
    // Class Variable: registrationFee (fixed for all vehicles)
    private static double registrationFee = 500.0;

    // Instance Variables: ownerName, vehicleType
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize instance variables
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // An instance method displayVehicleDetails() to display owner and vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // A class method updateRegistrationFee() to change the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a new VehicleRegistration object
        VehicleRegistration vehicle = new VehicleRegistration("John Doe", "Car");

        // Display vehicle details
        System.out.println("Vehicle Details:");
        vehicle.displayVehicleDetails();

        // Update registration fee
        System.out.println("\nUpdating registration fee...");
        updateRegistrationFee(600.0);

        // Display updated vehicle details
        System.out.println("\nUpdated Vehicle Details:");
        vehicle.displayVehicleDetails();
    }
}