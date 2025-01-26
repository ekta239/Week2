package packages.librarymanagementsystem;

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
    }

    @Override
    public void reserveItem() {
        isReserved = true;
        System.out.println("DVD reserved: " + getItemDetails());
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}