import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Department> departments;

    public Company() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }

    // Manual cleanup method to ensure the employees are cleared.
    public void cleanup() {
        for (Department department : departments) {
            department.deleteEmployees();
        }
        departments.clear();  // Clear departments if needed
    }
}

class Department {
    private List<Employee> employees;
    private String name;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public void deleteEmployees() {
        this.employees.clear();
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
}

public class CompanyandDepartment {
    public static void main(String[] args) {
        Company company = new Company();
        Department department = new Department("Department");
        company.addDepartment(department);
        
        Employee employee = new Employee("John Doe");
        department.addEmployee(employee);

        // Remove employee and department as part of cleanup
        department.removeEmployee(employee);
        company.removeDepartment(department);

        // Cleanup method to manually clear resources
        company.cleanup();

        // No need to call System.gc() manually
        System.out.println("Cleanup done, resources cleared.");
    }
}
