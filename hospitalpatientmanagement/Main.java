package packages.hospitalpatientmanagement;

public class Main {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "Alice", 30, 200.0, 5);
        Patient outPatient = new OutPatient("P002", "Bob", 40, 150.0);

        // Adding medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
        ((MedicalRecord) inPatient).addRecord("Post-operative care.");
        ((MedicalRecord) outPatient).addRecord("Consulted for fever.");

        // Displaying patient details and bills
        displayPatientDetails(inPatient);
        displayPatientDetails(outPatient);
    }

    public static void displayPatientDetails(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecord = (MedicalRecord) patient;
            System.out.println("Medical Records: " + medicalRecord.viewRecords());
        }

        System.out.println("-----------------------------------");
    }
}