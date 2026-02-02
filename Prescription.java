public class Prescription {
    private String medication;
    private String dose;
    private int duration;

    public Prescription(String medication, String dose, int duration) {
        this.medication = medication;
        this.dose = dose;
        this.duration = duration;
    }

    public String toString() {
        return medication + " - " + dose + " for " + duration + " days";
    }
}
