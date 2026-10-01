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
}