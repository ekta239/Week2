public class Product {
    // Product class attributes
    private String productName;
    private double price;
    private static int totalProducts = 0; // Static variable to track total products created

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products count
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Static method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Create product instances
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 599.99);
        Product product3 = new Product("Tablet", 399.99);

        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        product3.displayProductDetails();

        // Display total products created
        System.out.println("\nTotal Products Created:");
        Product.displayTotalProducts();
    }
}