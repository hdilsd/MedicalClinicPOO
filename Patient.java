public class Patient {
    private String name;
    private String surname;
    private String contact;
    private String allergies;

    public Patient(String name, String surname, String contact, String allergies) {
        this.name = name;
        this.surname = surname;
        this.contact = contact;
        this.allergies = allergies;
    }

    public String toString() {
        return name + " " + surname + " | Contact: " + contact + " | Allergies: " + allergies;
    }
}
