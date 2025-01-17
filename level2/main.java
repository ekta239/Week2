import java.util.List;
import java.util.ArrayList;
class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public double calculateTotalCost() {
        return items.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }

    public static class CartItem {
        private String itemName;
        private double price;
        private int quantity;

        public CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
public class main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingCart.CartItem("Apple", 1.5, 3));
        cart.addItem(new ShoppingCart.CartItem("Banana", 0.75, 2));
        System.out.println("Total cost: " + cart.calculateTotalCost());
        }
}