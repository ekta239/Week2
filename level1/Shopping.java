class Product {
    private static double discount = 0.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }

    public double calculateTotalPrice() {
        return (price * quantity) * (1 - discount);
    }

    public static boolean isValidProduct(Object obj) {
        return obj instanceof Product;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
public class Shopping{
    public static void main(String[] args) {
        Product product = new Product(1, "Product1", 100.0, 10);
        System.out.println("Total Price: " + product.calculateTotalPrice());
        }
    }
