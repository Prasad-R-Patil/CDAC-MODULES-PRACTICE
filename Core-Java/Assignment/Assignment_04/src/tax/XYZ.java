package tax;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Employee ID");
        int empId = sc.nextInt();
        
        sc.nextLine();  
        System.out.println("Enter Employee Name");
        String name = sc.nextLine();
        System.out.println("Enter Employee Monthly Salary:");
        double salary = sc.nextDouble();
        Employee e = new Employee(empId, name, salary);
        e.calcTax();

        // Product Info
        System.out.println("Enter Product ID");
        int pid = sc.nextInt();
        System.out.println("Enter Product  Price");
        double price = sc.nextDouble();
        System.out.println("Enter Product Quantity:");
        int qty = sc.nextInt();
        Product p = new Product(pid, price, qty);
        p.calcTax();

        sc.close();
    }
}
