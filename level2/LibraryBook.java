import java.util.ArrayList;

/**
 * Represents a book with a title and author.
 */
class Book {
    private String title; // Title of the book
    private String author; // Author of the book

    /**
     * Constructs a new Book object with the given title and author.
     **/
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     */
    public String getAuthor() {
        return author;
    }
}

/**
 * Represents a library with a name and a collection of books.
 */
class Library {
    private String name; // Name of the library
    private ArrayList<Book> books; // Collection of books in the library

    /**
     * Constructs a new Library object with the given name.
     **/
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library's collection.
    **/
    public void addBook(Book book) {
        this.books.add(book);
    }

    /**
     * Displays the books in the library.
     */
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}

/**
 * Main class for testing the Library and Book classes.
 */
public class LibraryBook {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library("My Library");

        // Add some books to the library
        library.addBook(new Book("Book1", "Author1"));
        library.addBook(new Book("Book2", "Author2"));

        // Display the books in the library
        library.displayBooks();
    }
}