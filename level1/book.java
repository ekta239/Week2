/**
 * Represents a book with title, author, and price.
 */
public class book {
    // Private fields to store book's title, author, and price
    private String title;
    private String author;
    private double price;

    /**
     * Default constructor to initialize a book with empty title and author, and zero price.
     */
    public book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    /**
     * Parameterized constructor to initialize a book with given title, author, and price.
     **/
    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and setters to access and modify book's properties

    /**
     * Returns the title of the book.
     **/
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the author of the book.
    **/
    public String getAuthor() {
        return author;
    }

    // Sets the author of the book.
    public void setAuthor(String author) {
        this.author = author;
    }

    // Returns the price of the book.
     
    public double getPrice() {
        return price;
    }

    // Sets the price of the book.
     
    public void setPrice(double price) {
        this.price = price;
    }
}