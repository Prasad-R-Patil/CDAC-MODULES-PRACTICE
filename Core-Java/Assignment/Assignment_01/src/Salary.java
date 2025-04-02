import java.util.Scanner;

public class Salary 
{
	private float BasicSal;
	private float HRA;
	private float DA;
	
	public Salary(float b)
	{
		BasicSal=b;
	}
	
	public void Cal()
	{
		if(BasicSal<1500)
		{
			HRA = BasicSal*10/100;
			DA = BasicSal*90/100;
			
			BasicSal=BasicSal+HRA+DA;
		}
		else
		{
			HRA = 500;
			DA = BasicSal*98/100;
			
			BasicSal=BasicSal+HRA+DA;
		}
	}
	
	public void Display()
	{
		System.out.println("Total Salary is => "+BasicSal);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Salary");
		float a = s.nextFloat();
		
		Salary sa = new Salary(a);
		
		sa.Cal();
		sa.Display();
		
		
		
	}
}


















