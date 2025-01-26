package packages.librarymanagementsystem;

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem() {
        isReserved = true;
        System.out.println("Magazine reserved: " + getItemDetails());
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}