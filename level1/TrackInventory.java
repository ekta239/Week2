class Item {
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize item attributes
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class TrackInventory {
    // Create an array to store items
    private Item[] items;
    private int itemIndex;

    // Constructor to initialize the inventory
    public TrackInventory(int maxItems) {
        items = new Item[maxItems];
        itemIndex = 0;
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        if (itemIndex < items.length) {
            items[itemIndex] = item;
            itemIndex++;
        } else {
            System.out.println("Inventory is full. Cannot add more items.");
        }
    }

    // Method to display all items in the inventory
    public void displayAllItems() {
        for (int i = 0; i < itemIndex; i++) {
            items[i].displayItemDetails();
            System.out.println();
        }
    }

    // Method to calculate total cost of all items in the inventory
    public double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemIndex; i++) {
            totalCost += items[i].calculateTotalCost(1); // Assuming quantity is 1 for each item
        }
        return totalCost;
    }

    public static void main(String[] args) {
        // Create a TrackInventory object with a maximum of 5 items
        TrackInventory inventory = new TrackInventory(5);

        // Create Item objects and add them to the inventory
        Item item1 = new Item("I001", "Laptop", 999.99);
        Item item2 = new Item("I002", "Smartphone", 599.99);
        Item item3 = new Item("I003", "Tablet", 399.99);

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        // Display all items in the inventory
        inventory.displayAllItems();

        // Calculate and display the total cost of all items in the inventory
        System.out.println("Total Cost: $" + inventory.calculateTotalCost());
    }
}