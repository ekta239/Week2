package packages.librarymanagementsystem;

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration(); // Abstract method

    public String getItemDetails() { // Concrete method
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}
