// Class representing a Subject
class Subject {
    private String subjectName;
    private int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

// Class representing a Student
class Student {
    private String studentName;
    private Subject[] subjects; // Aggregation: A Student has multiple Subjects

    public Student(String studentName, Subject[] subjects) {
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

// Class for GradeCalculator that calculates the grade for the student
class GradeCalculator {

    // Method to calculate grade based on marks
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to calculate the overall grade for a student
    public static void calculateStudentGrade(Student student) {
        System.out.println("Grades for " + student.getStudentName() + ":");
        for (Subject subject : student.getSubjects()) {
            String grade = calculateGrade(subject.getMarks());
            System.out.println(subject.getSubjectName() + ": " + grade);
        }
    }
}
public class students {
    public static void main(String[] args) {
        // Create subjects with marks
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Create an array of subjects
        Subject[] subjects = {maths, science};

        // Create a student named John
        Student john = new Student("John", subjects);

        // Use GradeCalculator to calculate and print grades
        GradeCalculator.calculateStudentGrade(john);
    }
}
