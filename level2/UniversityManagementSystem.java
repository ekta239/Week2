import java.util.ArrayList;
import java.util.List;

// Course class represents a course in the university
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        showEnrolledStudents();
    }
}

// Professor class represents a professor who teaches courses
class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        this.courses.add(course);
        course.setProfessor(this);  // Assign professor to the course
    }

    public void showCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Student class represents a student who can enroll in courses
class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        this.enrolledCourses.add(course);
        course.enrollStudent(this);  // Enroll the student in the course
    }

    public void showEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Main class to demonstrate the University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Professors
        Professor professor1 = new Professor("Dr. Alice");
        Professor professor2 = new Professor("Dr. Bob");

        // Create Courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        // Assign Professors to Courses
        professor1.assignCourse(course1);  // Dr. Alice teaches Mathematics
        professor2.assignCourse(course2);  // Dr. Bob teaches Computer Science

        // Create Students
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        // Students enroll in courses
        student1.enrollCourse(course1);  // John enrolls in Mathematics
        student1.enrollCourse(course2);  // John enrolls in Computer Science

        student2.enrollCourse(course1);  // Jane enrolls in Mathematics

        // Show details of the courses, students, and professors
        System.out.println("\nCourse Details:");
        course1.showCourseDetails();
        System.out.println();
        course2.showCourseDetails();

        System.out.println("\nProfessor Details:");
        professor1.showCourses();
        professor2.showCourses();

        System.out.println("\nStudent Details:");
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
    }
}
