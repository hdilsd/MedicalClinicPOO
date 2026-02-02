import java.util.ArrayList;

public class MedicalRecord {
    private Patient patient;
    private ArrayList<String> consultations = new ArrayList<>();
    private ArrayList<Prescription> prescriptions = new ArrayList<>();

    public MedicalRecord(Patient patient) {
        this.patient = patient;
    }

    public void addConsultation(String note) {
        consultations.add(note);
    }

    public void addPrescription(Prescription p) {
        prescriptions.add(p);
    }

    public void showRecord() {
        System.out.println("Medical Record for: " + patient);
        System.out.println("Consultations: " + consultations);
        System.out.println("Prescriptions: " + prescriptions);
    }
}
