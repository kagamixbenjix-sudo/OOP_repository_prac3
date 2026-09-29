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
