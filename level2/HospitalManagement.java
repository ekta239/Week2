import java.util.ArrayList;
import java.util.List;

// Doctor class represents a doctor in the hospital
class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    // Consult method to model communication between Doctor and Patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName() + " (" + patient.getDisease() + ")");
        System.out.println("Diagnosis and treatment plan for " + patient.getName() + ": " + patient.getTreatmentPlan());
    }

    public void showPatients() {
        System.out.println("Patients under Dr. " + name + " (" + specialty + "): ");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Patient class represents a patient in the hospital
class Patient {
    private String name;
    private String disease;
    private String treatmentPlan;
    private List<Doctor> doctors;

    public Patient(String name, String disease, String treatmentPlan) {
        this.name = name;
        this.disease = disease;
        this.treatmentPlan = treatmentPlan;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("Doctors treating " + name + " (" + disease + "): ");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }
}

// Hospital class represents the hospital containing doctors and patients
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in " + name + ": ");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }

    public void showPatients() {
        System.out.println("Patients in " + name + ": ");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Main class to demonstrate the interaction between Hospital, Doctors, and Patients
public class HospitalManagement {
    public static void main(String[] args) {
        // Create Doctors
        Doctor doctor1 = new Doctor("Alice", "Cardiologist");
        Doctor doctor2 = new Doctor("Bob", "Neurologist");

        // Create Patients
        Patient patient1 = new Patient("John Doe", "Heart Disease", "Medication and lifestyle changes");
        Patient patient2 = new Patient("Jane Smith", "Migraine", "Pain management and therapy");

        // Create a Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add Doctors and Patients to the Hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Add Patients to Doctors (establishing the association)
        doctor1.addPatient(patient1);
        doctor2.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Add Doctors to Patients (establishing the association)
        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor2);

        // Display Hospital's Doctors and Patients
        hospital.showDoctors();
        hospital.showPatients();

        // Demonstrate the consultation (communication between Doctor and Patient)
        doctor1.consult(patient1);
        doctor2.consult(patient2);
        doctor2.consult(patient1);

        // Show the doctors and patients for individual consultations
        patient1.showDoctors();
        patient2.showDoctors();
    }
}
