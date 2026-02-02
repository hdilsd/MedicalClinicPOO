public class Main {
    public static void main(String[] args) {

        Patient p = new Patient("Ali", "Ben", "0550000000", "Penicillin");
        Doctor d = new Doctor("Dr.Sara", "General");

        Appointment a = new Appointment(p, d, "05-02-2026", "10:30");
        a.showAppointment();

        MedicalRecord mr = new MedicalRecord(p);
        mr.addConsultation("Fever and cough");
        mr.addPrescription(new Prescription("Paracetamol", "500mg", 5));

        mr.showRecord();
    }
}
