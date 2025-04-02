import java.util.Scanner;

public class Swap 
{
	private int x;
	private int y;
	
	public void init(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Before Swap  => "+x+" " +y);
	}
	
	public void swap()
	{
		x=x+y;
		y=x-y;
		x=x-y;
	}
	
	public void display()
	{
		System.out.println("After Swap  => "+x+" " +y);
	}
	
	public static void main(String[] args) 
	{
		Swap sw = new Swap();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x value");
		int x = s.nextInt();
		
		System.out.println("Enter y value");
		int y = s.nextInt();
		
		sw.init(x,y);
		sw.swap();
		sw.display();
		
	}

}
