package campus.academics;

import campus.data.Person;

public class Student extends Person {
    private int rollno;
    private String branch;
    private int semester;

    public Student(String name, int age, String address, int rollno, String branch, int semester) {
        super(name, age, address);
        this.rollno = rollno;
        this.branch = branch;
        this.semester = semester;
    }
}
