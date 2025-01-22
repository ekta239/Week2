    class Book {
        public String ISBN;
        protected String title;
        private String author;

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return this.author;
        }
    }

    class EBook extends Book {
        public void displayDetails() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
        }
    }

    public class BookibrarySystem {
        public static void main(String[] args) {
            EBook eBook = new EBook();
            eBook.ISBN = "1234567890";
            eBook.title = "Example Book";
            eBook.setAuthor("John Doe");
            eBook.displayDetails();
            System.out.println("Author: " + eBook.getAuthor());
        }
    }