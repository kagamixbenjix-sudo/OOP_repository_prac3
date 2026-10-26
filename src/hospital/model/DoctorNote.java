package hospital.model;

// Subclass demonstrating protected access inheritance in the same package
public class DoctorNote extends PatientRecord {

    public DoctorNote(String patientName, String medicalHistory, java.time.LocalDate appointmentDate, String doctorNotes) {
        super(patientName, medicalHistory, appointmentDate, doctorNotes);
    }
    // Demonstrates access to protected variable 'doctorNotes' inherited from PatientRecord
    public void appendDoctorNote(String additionalNote) {
        this.doctorNotes += " | " + additionalNote;
        System.out.println("Updated Doctor Note for " + getPatientName() + ": " + this.doctorNotes);
    }
}