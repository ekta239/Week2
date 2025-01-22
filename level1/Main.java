class Employee {
    // Publicly accessible employee ID
    public int employeeID;
    // Department of the employee (accessible within the class and its subclasses)
    protected String department;
    // Private salary of the employee (accessible only within the class)
    private double salary;

    // Constructor to initialize an Employee object
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify the salary of an employee
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    // Method to retrieve the salary of an employee
    public double getSalary() {
        return salary;
    }
}

// Subclass Manager that extends the Employee class
class Manager extends Employee {
    // Constructor to initialize a Manager object
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display the employee information of a manager
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Main class containing the main method
public class Main {
    // Main method to test the Employee and Manager classes
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(1, "HR", 50000.0);
        System.out.println("Initial Salary: " + employee.getSalary());
        // Modify the salary of the employee
        employee.modifySalary(60000.0);
        System.out.println("Modified Salary: " + employee.getSalary());

        // Create a Manager object
        Manager manager = new Manager(2, "IT", 70000.0);
        // Display the employee information of the manager
        manager.displayEmployeeInfo();
    }
}