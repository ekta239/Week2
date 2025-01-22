public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;
    private double totalCost;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        calculateTotalCost();
    }

    // Constructor to initialize rental details with default daily rate
    public CarRental(String customerName, String carModel, int rentalDays) {
        this(customerName, carModel, rentalDays, 50.0); // Default daily rate is $50.0
    }

    // Method to calculate total cost
    private void calculateTotalCost() {
        totalCost = rentalDays * dailyRate;
    }

    // Getters for attributes
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getTotalCost() {
        return totalCost;
    }
}