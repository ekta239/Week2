class Bookdetails {
    // Private fields to store book details
    private String title;
    private String author;
    private double price;

   
    public Bookdetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Displays the book details, including title, author, and price.
     */
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class InnerBookdetails {

    public static void main(String[] args) {
        // Create an instance of Bookdetails
        Bookdetails book = new Bookdetails("The Great Gatsby", "F. Scott Fitzgerald", 14.99);
        
        // Display the book details
        book.displayBookDetails();
    }
}