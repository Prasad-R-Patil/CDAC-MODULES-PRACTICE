package campus;

import campus.accounts.Fees;
import java.time.LocalDate;

public class CampusApp {
    public static void main(String[] args) {
        Fees[] students = new Fees[4];

        students[0] = new Fees("Amit Sharma", "CSE", 45000, LocalDate.of(2025, 4, 5));
        students[1] = new Fees("Sneha Patil", "IT", 47000, LocalDate.of(2025, 4, 6));
        students[2] = new Fees("Ravi Mehta", "ECE", 44000, LocalDate.of(2025, 4, 7));
        students[3] = new Fees("Priya Desai", "EEE", 46000, LocalDate.of(2025, 4, 8));

        double totalFees = 0;
        for (Fees f : students) {
            System.out.println(f);
            totalFees += f.getAmount();
        }

        System.out.println("\nTotal Fees Collected: ₹" + totalFees);
    }
}
