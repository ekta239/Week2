import java.util.ArrayList;
import java.util.List;

// University class represents the Composition relationship with Department
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    // When a University is deleted, all associated Departments should also be deleted (Composition).
    public void delete() {
        System.out.println("Deleting University: " + name);
        for (Department department : departments) {
            department.delete();  // This will delete all departments of this university
        }
        departments.clear();
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ": ");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }
}

// Department class represents Aggregation relationship with Faculty members
class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    // A department will not delete the faculty members; they exist outside of the department.
    public void delete() {
        System.out.println("Deleting Department: " + name);
        // Do not delete the faculty members, as they can exist outside the department
        facultyMembers.clear();
    }

    public void showFaculty() {
        System.out.println("Faculty in " + name + ": ");
        for (Faculty faculty : facultyMembers) {
            System.out.println("- " + faculty.getName());
        }
    }
}

// Faculty class represents an individual faculty member who can exist outside of a department (Aggregation)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class to demonstrate the functionality
public class UniversityManagement {
    public static void main(String[] args) {
        // Creating Faculty members
        Faculty faculty1 = new Faculty("Dr. John Doe");
        Faculty faculty2 = new Faculty("Dr. Jane Smith");
        Faculty faculty3 = new Faculty("Dr. Emily White");

        // Creating Departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        // Creating University
        University university = new University("ABC University");

        // Adding Faculty to Departments
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        // Adding Departments to University (Composition)
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Show the structure before deletion
        university.showDepartments();
        department1.showFaculty();
        department2.showFaculty();

        // Deleting University (This will also delete all Departments, demonstrating Composition)
        university.delete();

        // Show the structure after deletion
        university.showDepartments();  // Should show no departments
    }
}
