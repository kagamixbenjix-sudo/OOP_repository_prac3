package hospital.model;

import java.time.LocalDate;

public class PatientRecord {
    // Private variables: strictly encapsulated, visible only inside this class
    private String patientName;
    private String medicalHistory;
    private LocalDate appointmentDate;

    // Protected field: accessible within hospital.model package and by subclasses
    protected String doctorNotes;

    // Public constructor: allows creation of PatientRecord objects from any package
    public PatientRecord(String patientName, String medicalHistory, LocalDate appointmentDate, String doctorNotes) {
        this.patientName = patientName;
        this.medicalHistory = medicalHistory;
        this.appointmentDate = appointmentDate;
        this.doctorNotes = doctorNotes;
    }

    // Public getters for receptionists and doctors (basic details)
    public String getPatientName() {
        return patientName;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    // Doctor-level access methods
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void updateMedicalHistory(String newHistory) {
        this.medicalHistory = newHistory;
    }
    public void displayReceptionistView() {
        System.out.println("--- Receptionist View ---");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Appointment Date: " + appointmentDate);
    }
    public void displayDoctorView() {
        System.out.println("--- Doctor View ---");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Doctor Notes: " + doctorNotes);
    }
}
