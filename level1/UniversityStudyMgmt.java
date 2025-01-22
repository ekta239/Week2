public class UniversityStudyMgmt {
    public static class Student {
        private static String universityName = "Example University";
        private static int totalStudents = 0;
        private final int rollNumber;
        private String name;
        private String grade;

        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++;
        }

        public static void displayTotalStudents() {
            System.out.println("Total students enrolled: " + totalStudents);
        }

        public void displayStudentInfo() {
            if (this instanceof Student) {
                System.out.println("University Name: " + universityName);
                System.out.println("Name: " + name);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Grade: " + grade);
            }
        }

        public void updateGrade(String newGrade) {
            if (this instanceof Student) {
                this.grade = newGrade;
            }
        }
    }
}