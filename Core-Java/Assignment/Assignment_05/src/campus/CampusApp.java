package campus;

import java.util.Scanner;
import campus.academics.Faculty;

public class CampusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty[] faculties = new Faculty[5];
        double totalSalary = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Faculty " + (i + 1) + ":");
            System.out.print("Faculty ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Branch: ");
            String branch = sc.nextLine();

            faculties[i] = new Faculty(id, name, age, address, salary, branch);
            totalSalary += faculties[i].getSalary();
        }

        System.out.println("\nTotal salary of all faculties: " + totalSalary);
        sc.close();
    }
}
