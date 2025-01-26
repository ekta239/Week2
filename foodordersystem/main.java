package packages.foodordersystem;

public class main {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Vegetable Pizza", 8.99, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 5.99, 3, 1.50);

        processOrder(vegItem);
        processOrder(nonVegItem);
    }

    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: " + foodItem.calculateTotalPrice());

        if (foodItem instanceof Discountable) {
            Discountable discountableItem = (Discountable) foodItem;
            double discount = discountableItem.applyDiscount();
            System.out.println(discountableItem.getDiscountDetails());
            System.out.println("Discount Amount: " + discount);
            System.out.println("Final Price after Discount: " + (foodItem.calculateTotalPrice() - discount));
        }

        System.out.println("-----------------------------------");
    }
}