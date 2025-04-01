import java.util.Scanner;
public class CircleArea {
	
	private int radius;
	private float Area;
	private float CF;
	private float PI = 3.14f;
	
	public void init(int r)
	{
		radius = r;
	}
	
	public void AreaCal()
	{
		Area = PI*radius*radius;
		
		CF = (float)2*PI*radius;
		
		
	}
	
	public void Display()
	{
		System.out.println("Area is circle => "+Area);
		
		System.out.println("Area is circleCF => "+CF);
	}
	
	public static void main(String[] args) {
		
		CircleArea A = new CircleArea();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Radius");
		
		int r = s.nextInt();
		
		A.init(r);
		A.AreaCal();
		A.Display();
	}

}
