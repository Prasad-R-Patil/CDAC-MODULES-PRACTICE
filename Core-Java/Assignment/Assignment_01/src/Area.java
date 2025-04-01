import java.util.*;

public class Area 
{
	private int radius;
	private float area;
	
	
	public void init(int r)
	{
		radius=r;
	}
	
	public void Calc()
	{
		area = 3.14f*radius*radius;
	}
	
	public void Display()
	{
		System.out.println("Area of Citcle is => "+area);
	}
	
	public static void main(String[] args) 
	{
		Area a = new Area();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Radius");
		
		int r=s.nextInt();
		
		a.init(r);
		a.Calc();
		a.Display();
		
		
		
		
	}

}
