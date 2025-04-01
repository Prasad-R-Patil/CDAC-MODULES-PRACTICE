
import java.util.Scanner;

public class MathOperation1 
{
	 private int x;
	 private int y;
	 
	 private int a , m , p=1;
	 
	 public void init(int a, int b)
	 {
		 x=a;
		 y=b;
	 }
	 
	 public void add()
	 {
		  a=x+y;
	 }
	 
	 public void multiply()
	 {
		  m = x*y;
	 }
	 
	 public void power()
	 {
		  p=1;
		 
		 for(int i=1; i<=y; i++)
		 {
			 p=p*x;
		 }
		 
		 
	 }
	 
	 public void Display()
	 {
		 System.out.println("Addtion is "+a);
		 System.out.println("Addtion is "+m);
		 System.out.println("Addtion is "+p);
	 }
	 
	 public static void main(String[] args) 
	 {
		MathOperation1 m = new MathOperation1();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number Value of X ");
		int a = s.nextInt();
		System.out.println("Enter number Value of Y ");
		int b = s.nextInt();
		
		m.init(a,b);
		m.add();
		m.multiply();
		m.power();
		m.Display();
	 }
}






















