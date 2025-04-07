package tax;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;  // Monthly salary

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double yearlySalary = salary * 12;
        double tax = yearlySalary * incomeTax;
        System.out.println("Income Tax for employee " + name + " is: " + tax);
    }
}
