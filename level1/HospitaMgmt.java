public class HospitaMgmt {
    public static class Patient {
        private static String hospitalName = "City Hospital";
        private static int totalPatients = 0;
        private final int patientID;
        private String name;
        private int age;
        private String ailment;

        public Patient(String name, int age, String ailment) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            this.patientID = totalPatients + 1;
            totalPatients++;
        }

        public static int getTotalPatients() {
            return totalPatients;
        }

        public void displayDetails() {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }

        public static void main(String[] args) {
            Patient patient1 = new Patient("John Doe", 30, "Fever");
            Patient patient2 = new Patient("Jane Doe", 25, "Cold");

            if (patient1 instanceof Patient) {
                patient1.displayDetails();
            }

            if (patient2 instanceof Patient) {
                patient2.displayDetails();
            }

            System.out.println("Total Patients: " + Patient.getTotalPatients());
            System.out.println("Hospital Name: " + Patient.hospitalName);
        }
    }
}