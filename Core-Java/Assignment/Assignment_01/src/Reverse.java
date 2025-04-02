import java.util.Scanner;

public class Reverse 
{
	private int no;
	private int rev;
	
	
	public Reverse(int a)
	{
		no=a;
	}
	
	public void Reverse()
	{
		while(no!=0)
		{
			int rem=no%10;
			 rev=rev*10+rem;
			no=no/10;
		}
	}
	
	public void display()
	{
		System.out.println(rev);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no value");
		int a = s.nextInt();
		
		Reverse r = new Reverse(a);
		
		r.Reverse();
		r.display();
	}
}
