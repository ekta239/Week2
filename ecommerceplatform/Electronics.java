package packages.ecommerceplatform;
// Concrete class Electronics
class Electronics extends Product implements Taxable {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount for electronics
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST for electronics
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied.";
    }
}