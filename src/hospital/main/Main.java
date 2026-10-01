package hospital.main;

import hospital.model.PatientRecord;
import hospital.model.DoctorNote;
import hospital.model.FinancialRecord;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create Patient records
        PatientRecord patient1 = new PatientRecord("John Doe", "Hypertension, Asthma", LocalDate.now(), "Monitor blood pressure daily");
        DoctorNote doctorNote1 = new DoctorNote("Jane Smith", "Type 2 Diabetes", LocalDate.now(), "Check blood sugar levels");
        FinancialRecord finance1 = new FinancialRecord("John Doe", 450.0);

        // 1. Receptionist access test
        patient1.displayReceptionistView();
        System.out.println();

        // 2. Doctor access test
        patient1.displayDoctorView();
        patient1.updateMedicalHistory("Hypertension, Asthma, Allergy to Penicillin");
        System.out.println("Updated Medical History: " + patient1.getMedicalHistory());
        System.out.println();

        // 3. Subclass & Protected access test
        doctorNote1.appendDoctorNote("Prescribed Insulin dosage adjusted");
        System.out.println();

        // 4. Administration / Financial record test
        finance1.displayFinancialDetails();
        finance1.processPayment(500.0);
        finance1.displayFinancialDetails();

        // Note: Direct access to patient1.patientName or finance1.totalBill is impossible
        // because they are marked 'private' (Access Modifier Restriction).
    }
}
