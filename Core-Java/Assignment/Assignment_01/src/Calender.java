
import java.util.Scanner;

public class Calender 
{
	private int year;
	private int month;
	private int day;
	private int days;
	
	public void CalCal(int d)
	{
		days = d;
		
		
		year = days/365;
		days = days%365;
		month = days/30;
		days = days%30;
		day = days;
	}
	
	
	public void Display()
	{
		System.out.println("Year -> [ "+year+" ] &  Month -> [ "+month+ " ]  &  Day -> [ "+day+" ]" );
	}
	
	public static void main(String[] args) 
	{
		Calender c = new Calender();
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Days => ");
		int d = s1.nextInt();
		
		c.CalCal(d);
		c.Display();
		
		
	}

}
