import java.util.ArrayList;
import java.util.List;

// Product class represents individual products in the e-commerce platform
class Product {
    private String name;
    private double price;
    private int productId;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return name + " (ID: " + productId + ") - $" + price;
    }
}

// Order class represents an order placed by a customer
class Order {
    private int orderId;
    private customer customer;
    private List<Product> products;
    private double totalPrice;

    public Order(int orderId, customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();  // Update total price
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("customer: " + customer.getName());
        System.out.println("Products in the order: ");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public customer getCustomer() {
        return customer;
    }
}

// customer class represents a customer in the e-commerce platform
class customer {
    private String name;
    private int customerId;
    private List<Order> orders;

    public customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " has placed an order with ID: " + order.getOrderId());
    }

    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main class to simulate the e-commerce platform's interactions
public class ECommercePlatforms {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product(101, "Laptop", 799.99);
        Product product2 = new Product(102, "Smartphone", 599.99);
        Product product3 = new Product(103, "Headphones", 89.99);
        Product product4 = new Product(104, "Keyboard", 49.99);

        // Create a customer
        customer customer = new customer(1, "John Doe");

        // Create Orders for the customer
        Order order1 = new Order(1, customer);
        order1.addProduct(product1);
        order1.addProduct(product3);

        Order order2 = new Order(2, customer);
        order2.addProduct(product2);
        order2.addProduct(product4);

        // customer places the Orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show the Orders placed by the customer
        customer.showOrders();
    }
}
