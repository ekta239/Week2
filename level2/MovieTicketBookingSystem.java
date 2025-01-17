class MovieTicket {
    // Attributes to store movie name, seat number, and price
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor to initialize movie ticket with name and price
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.seatNumber = 0; // Initialize seat number to 0 (not booked)
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(int seatNumber) {
        if (this.seatNumber == 0) {
            this.seatNumber = seatNumber;
            System.out.println("Ticket booked successfully for seat number " + seatNumber);
        } else {
            System.out.println("Ticket is already booked for seat number " + this.seatNumber);
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}






public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        MovieTicket ticket = new MovieTicket("Avengers", 15.99);
        ticket.displayTicketDetails();
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        ticket.bookTicket(seatNumber);
        ticket.displayTicketDetails();
        scanner.close();
        System.out.println("Thank you for booking a ticket!");
        
    }
}