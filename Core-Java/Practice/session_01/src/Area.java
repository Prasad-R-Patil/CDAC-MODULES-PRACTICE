
public class Area {
	
	private int radius;
	private float Area;
	private float CF;
	private float PI = 3.14f;
	
	public Area(int r)
	{
		radius = r;
	}
	
	public void AreaCal()
	{
		Area = PI*radius*radius;
		
		System.out.println("Area is circle => "+Area);
	}
	
	public void CircleFerence()
	{
		CF = (float)2*PI*radius;
		
		System.out.println("Area is circleCF => "+CF);
	}
	
	public static void main(String[] args) {
		
		Area A = new Area(5);
		
		A.AreaCal();
		A.CircleFerence();
	}
}
