
class Employee {
    // Private attributes for employee name, id, and salary
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

// Main class to test Employee class
public class Employeedetails {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter employee details
        System.out.print("Enter the name of the employee: ");
        String name = scanner.nextLine();
        System.out.print("Enter the ID of the employee: ");
        int id = scanner.nextInt();
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        // Close the Scanner object
        scanner.close();

        // Create an Employee object with user input
        Employee employee = new Employee(name, id, salary);

        // Display employee details
        employee.displayDetails();
    }
}
