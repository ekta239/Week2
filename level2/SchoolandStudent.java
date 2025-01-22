import java.util.*;

// Represents a school with a name and a list of students
class School {
    private String name;
    private List<Student> students;

    // Initializes a new school with the given name
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Adds a student to the school
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }
}

// Represents a student with a name and a list of courses
class Student {
    private String name;
    private List<Course> courses;

    // Initializes a new student with the given name
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enrolls the student in a course
    public void enrollCourse(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }

    // Returns the list of courses the student is enrolled in
    public List<Course> getCourses() {
        return courses;
    }

    // Returns the student's name
    public String getName() {
        return name;
    }
}

// Represents a course with a name and a list of students
class Course {
    private String name;
    private List<Student> students;

    // Initializes a new course with the given name
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Adds a student to the course
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Returns the list of students enrolled in the course
    public List<Student> getStudents() {
        return students;
    }

    // Returns the course's name
    public String getName() {
        return name;
    }
}

// Main class to demonstrate the usage of School, Student, and Course classes
public class SchoolandStudent {
    public static void main(String[] args) {
        // Create a new school
        School school = new School("ABC School");

        // Create two new students
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Doe");

        // Add the students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create two new courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Enroll the students in the courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Print the courses enrolled by student1
        System.out.println("Courses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getName());
        }

        // Print the students enrolled in course1
        System.out.println("Students enrolled in " + course1.getName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }
    }
}