import java.util.Scanner;

public class Temperature 
{
	private float Fahrenheit;
	private int Celsius;
	
	public Temperature(float f)
	{
		Fahrenheit = f;
		
		
	}
	
	public void Convert()
	{
		Celsius = Math.round(5*(Fahrenheit-32)/9) ;
	}
	
	public void Dislay()
	{
		System.out.println("Temperature in Celsius => "+Celsius);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Fahrenheit => ");
		float f = s.nextFloat();
		
		
		Temperature t = new Temperature(f);
		
		t.Convert();
		t.Dislay();
		
		
	}
}
