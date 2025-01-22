/**
 * Represents a book in a library.
 */
public class LibraryBook {
    // Book title
    private String title;
    // Book author
    private String author;
    // Book price
    private double price;
    // Availability status of the book
    private boolean isAvailable;

    // Constructs a new LibraryBook object.
    
    
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Initially, the book is available
    }

     // Returns the title of the book.
     
    public String getTitle() {
        return title;
    }

    // Returns the author of the book.
     
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the price of the book.
     * 
     * @return the price of the book
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the availability status of the book.
     * 
     * @return true if the book is available, false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Borrows the book if it is available.
     */
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as unavailable
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    /**
     * Returns the book to the library.
     */
    public void returnBook() {
        isAvailable = true; // Mark the book as available
        System.out.println("Book returned successfully.");
    }
}