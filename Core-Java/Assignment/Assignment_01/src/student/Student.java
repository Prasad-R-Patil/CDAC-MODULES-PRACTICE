package student;

public class Student 
{
	  private int rollNo;
	    private String name;
	    private int age;
	    private float score;

	    public Student(int rollNo, String name, int age, float score) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.age = age;
	        this.score = score;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public float getScore() {
	        return score;
	    }

	    public void setScore(float score) {
	        this.score = score;
	    }
	
	
	
	
}
