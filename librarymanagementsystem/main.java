package packages.librarymanagementsystem;

public class main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        items[1] = new Magazine("M001", "National Geographic", "Various");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem();
                } else {
                    System.out.println("Item is not available for reservation.");
                }
            }
            System.out.println();
        }
    }
}
