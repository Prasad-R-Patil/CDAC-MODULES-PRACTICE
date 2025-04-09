package campus.accounts;

import java.time.LocalDate;

public class Fees {
    private String studentName;
    private String branch;
    private double amount;
    private LocalDate paymentDate;

    public Fees(String studentName, String branch, double amount, LocalDate paymentDate) {
        this.studentName = studentName;
        this.branch = branch;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Student: " + studentName + ", Branch: " + branch + ", Amount: " + amount + ", Date: " + paymentDate;
    }
}
