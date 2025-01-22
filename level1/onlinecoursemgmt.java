public class onlinecoursemgmt {
    // Class Variable: instituteName (common for all courses)
    public static String instituteName = "Online Course Management Institute";

    // Instance Variables: courseName, duration, fee
    private String courseName;
    private int duration;
    private double fee;

    // Constructor to initialize instance variables
    public onlinecoursemgmt(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method displayCourseDetails() to display the course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method updateInstituteName() to modify the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Create two course objects
        onlinecoursemgmt course1 = new onlinecoursemgmt("Java Programming", 3, 500.0);
        onlinecoursemgmt course2 = new onlinecoursemgmt("Python Programming", 4, 600.0);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();
        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();

        // Update institute name
        updateInstituteName("New Online Course Management Institute");

        // Display updated course details
        System.out.println();
        System.out.println("Updated Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();
        System.out.println("Updated Course 2 Details:");
        course2.displayCourseDetails();
    }
}