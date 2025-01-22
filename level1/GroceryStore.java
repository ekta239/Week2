// Class representing a Product in the grocery store
class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for this product
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

// Class representing a Customer who buys products
class Customer {
    private String customerName;
    private Product[] products; // Composition: A Customer can have multiple Products

    public Customer(String customerName, Product[] products) {
        this.customerName = customerName;
        this.products = products;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Product[] getProducts() {
        return products;
    }
}

// Class for BillGenerator that calculates the total bill for a customer
class BillGenerator {

    // Method to generate the bill for the customer
    public static double generateBill(Customer customer) {
        double totalAmount = 0.0;

        // Iterate through the customer's products and calculate the total bill
        for (Product product : customer.getProducts()) {
            totalAmount += product.getTotalPrice();
        }
        
        return totalAmount;
    }
}
public class GroceryStore {
    public static void main(String[] args) {
        // Create product objects with product name, price per unit, and quantity
        Product apples = new Product("Apples", 3.0, 2);  // 2 kg at $3 per kg
        Product milk = new Product("Milk", 2.0, 1);     // 1 liter at $2 per liter

        // Create an array of products
        Product[] products = {apples, milk};

        // Create a customer named Alice
        Customer alice = new Customer("Alice", products);

        // Use BillGenerator to calculate and print the total bill for Alice
        double totalBill = BillGenerator.generateBill(alice);
        System.out.println("Total Bill for " + alice.getCustomerName() + ": $" + totalBill);
    }
}
