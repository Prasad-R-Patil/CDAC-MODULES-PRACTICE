package student;
import java.util.Scanner;

public class Score 
{
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter No of Student => ");
	        int st= sc.nextInt();
	        Student[] ss = new Student[st];
	        
	        for (int i = 0; i < st; i++) {
	            System.out.println("Enter details for Student " + (i + 1) + ":");
	            System.out.print("Roll No: ");
	            int rollNo = sc.nextInt();
	            System.out.print("Name: ");
	            String name = sc.next();
	            System.out.print("Age: ");
	            int age = sc.nextInt();
	            System.out.print("Score: ");
	            float score = sc.nextFloat();
	            ss[i] = new Student(rollNo, name, age, score);
	        }
	        
	        sc.close();

	        
	        
	        System.out.println("\nScore Group 0-50:");
	        for (Student s : ss) {
	            if (s.getScore() <= 50) 
	                System.out.println("Name: " + s.getName() + ", Roll No: " + s.getRollNo() + ", Age: " + s.getAge() + ", Score: " + s.getScore());
	        }
	        
	        System.out.println("\nScore Group 50-65:");
	        for (Student s : ss) {
	            if (s.getScore() > 50 && s.getScore() <= 65) 
	                System.out.println("Name: " + s.getName() + ", Roll No: " + s.getRollNo() + ", Age: " + s.getAge() + ", Score: " + s.getScore());
	        }
	        
	        System.out.println("\nScore Group 65-80:");
	        for (Student s : ss) {
	            if (s.getScore() > 65 && s.getScore() <= 80) 
	                System.out.println("Name: " + s.getName() + ", Roll No: " + s.getRollNo() + ", Age: " + s.getAge() + ", Score: " + s.getScore());
	        }
	        
	        System.out.println("\nScore Group 80-100:");
	        for (Student s : ss) {
	            if (s.getScore() > 80 && s.getScore() <= 100) 
	                System.out.println("Name: " + s.getName() + ", Roll No: " + s.getRollNo() + ", Age: " + s.getAge() + ", Score: " + s.getScore());
	        }
	    }
}
