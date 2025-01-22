public class Employee {
    private static String companyName = "ABC Corporation";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", "Software Engineer");
        Employee emp2 = new Employee(2, "Jane Doe", "Data Scientist");

        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }

        displayTotalEmployees();
    }
}