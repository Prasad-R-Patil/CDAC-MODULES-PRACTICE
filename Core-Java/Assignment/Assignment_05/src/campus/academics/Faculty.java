package campus.academics;

import campus.data.Person;

public class Faculty extends Person {
    private int facultyId;
    private double salary;
    private String branch;

    public Faculty(int facultyId, String name, int age, String address, double salary, String branch) {
        super(name, age, address);
        this.facultyId = facultyId;
        this.salary = salary;
        this.branch = branch;
    }

    public double getSalary() {
        return salary;
    }
}
