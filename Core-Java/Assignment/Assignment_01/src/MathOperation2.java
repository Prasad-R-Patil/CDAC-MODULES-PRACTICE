
public class MathOperation2 
{
	
	public void multiply(int a , int b)
	{
		System.out.println("Multiply two Int => "+(a*b));
	}
	
	public void multiply(float x, float y, float z)
	{
		System.out.println("Multiply three float => "+(x*y*z));
	}
	
	public void multiply(int arr[])
	{
		int sum = 1;
		
		for(int i=1; i<5; i++)
		{
			sum=sum*arr[i];
		}
		
		System.out.println("Multiply All Array Element => "+sum);
	}
	
	public void multiply(double y , int z)
	{
		System.out.println("Multiply Double & Int => "+(float)(y*z));
	}
	
	public static void main(String[] args) 
	{
		MathOperation2 m = new MathOperation2();
		
		int arr[]= {1,2,3,4,5};
		
		m.multiply(10,20);
		m.multiply(12.15f,35.77f,85.50f);
		m.multiply(arr);
		m.multiply(89.555d,42);
	}
	
	
}
