package hospital.model;

public class FinancialRecord {
    // Private variables: sensitive financial data restricted to administration
    private String patientName;
    private double totalBill;
    private boolean isPaid;

    public FinancialRecord(String patientName, double totalBill) {
        this.patientName = patientName;
        this.totalBill = totalBill;
        this.isPaid = false;
    }
    // Package-private / Admin validation methods
    public void processPayment(double amount) {
        if (amount >= totalBill) {
            isPaid = true;
            System.out.println("Payment successful for " + patientName);
        } else {
            System.out.println("Insufficient payment amount for " + patientName);
        }
    }

    public void displayFinancialDetails() {
        System.out.println("--- Hospital Administration Financial Record ---");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Payment Status: " + (isPaid ? "Paid" : "Pending"));
    }
}