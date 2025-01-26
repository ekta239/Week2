package packages.ecommerceplatform;

// Concrete class Clothing
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount for clothing
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST for clothing
    }

    @Override
    public String getTaxDetails() {
        return "12% GST applied.";
    }
}