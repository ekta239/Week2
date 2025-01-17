public class MobilePhoneDetails {
    // Attributes of the MobilePhone class
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the attributes
    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display the details of the phone
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create objects of the MobilePhone class
        MobilePhoneDetails phone1 = new MobilePhoneDetails("Apple", "iPhone 14", 999.99);
        MobilePhoneDetails phone2 = new MobilePhoneDetails("Samsung", "Galaxy S22", 899.99);

        // Display the details of the phones
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();
        System.out.println();
        System.out.println("Phone 2 Details:");
        phone2.displayDetails();
    }
}