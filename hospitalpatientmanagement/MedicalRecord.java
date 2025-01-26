package packages.hospitalpatientmanagement;
import java.util.List;

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}