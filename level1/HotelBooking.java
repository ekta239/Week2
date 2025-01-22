public class HotelBooking {
    // Attributes
    private String guestName; // Name of the guest
    private String roomType; // Type of room booked
    private int nights; // Number of nights booked

    // Default constructor
    public HotelBooking() {
        // Initialize with default values
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        // Initialize with provided values
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        // Initialize with values from another booking
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Getters and setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}