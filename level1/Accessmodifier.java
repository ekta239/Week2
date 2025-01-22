class Student {
    // Public variable to store roll number
    public int rollNumber;
    // Protected variable to store name
    protected String name;
    // Private variable to store CGPA
    private double CGPA;

    // Constructor to initialize roll number, name, and CGPA
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Class to represent postgraduate students
class PostgraduateStudent extends Student {
    // Private variable to store research topic
    private String researchTopic;

    // Constructor to initialize roll number, name, CGPA, and research topic
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayDetails();
        System.out.println("Research Topic: " + researchTopic);
    }

    // Method to modify name
    public void modifyName(String newName) {
        name = newName;
    }
}

// Main class to test access modifiers
public class Accessmodifier {
    // Main method
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student(1, "John Doe", 8.5);
        // Display student details
        student.displayDetails();
        // Update CGPA
        student.setCGPA(9.0);
        // Display updated student details
        student.displayDetails();

        // Create a postgraduate student object
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent(2, "Jane Doe", 9.0, "Machine Learning");
        // Display postgraduate student details
        postgraduateStudent.displayPostgraduateDetails();
        // Modify name
        postgraduateStudent.modifyName("Jane Smith");
        // Display updated postgraduate student details
        postgraduateStudent.displayPostgraduateDetails();
    }
}