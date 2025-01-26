package packages.foodordersystem;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity(); // Include additional charge for non-veg items
    }

    @Override
    public double applyDiscount() {
        // Example: 10% discount on non-veg items
        return calculateTotalPrice() * 0.1;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on non-veg items.";
    }
}
