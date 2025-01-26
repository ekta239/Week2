package packages.librarymanagementsystem;

// Subclass Book
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public void reserveItem() {
        isReserved = true;
        System.out.println("Book reserved: " + getItemDetails());
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}