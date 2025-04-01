
public class Marks {
	
	public Marks(float a, float b, float c, float d,float e)
	{
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
		sub5=e;
		
	}
	private float precentage;
	private float sub1;
	private float sub2;
	private float sub3;
	private float sub4;
	private float sub5;
	
	
	public void CalPre()
	{
		precentage = (sub1+sub2+sub3+sub4+sub5)/5;
		
		System.out.println("Precentage is => "+precentage);
	}
	
	public static void main(String[] args) {
		
		Marks m = new Marks(55.22f,88.65f,44.66f,77.44f,54.55f);
		
		m.CalPre();
		
		
	}
}
