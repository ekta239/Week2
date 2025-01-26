package packages.ecommerceplatform;

// Utility class to showcase polymorphism
class main {
    public void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() - discount;
        if (product instanceof Taxable) {
            Taxable taxableProduct = (Taxable) product;
            double tax = taxableProduct.calculateTax();
            finalPrice += tax;
            System.out.println("Product: " + product.getName() + " | Final Price: " + finalPrice + " | " + taxableProduct.getTaxDetails());
        } else {
            System.out.println("Product: " + product.getName() + " | Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        main platform = new main();

        Product electronics = new Electronics(101, "Laptop", 50000);
        Product clothing = new Clothing(102, "T-Shirt", 2000);
        Product groceries = new Groceries(103, "Rice", 1000);

        platform.printFinalPrice(electronics);
        platform.printFinalPrice(clothing);
        platform.printFinalPrice(groceries);
    }
}