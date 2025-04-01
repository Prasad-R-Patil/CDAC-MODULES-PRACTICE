
public class EMP 
{
	private static int empNo;
	private float sal;
	private static float Tsal;
	
	
	public EMP(float s)
	{
		this.empNo = ++empNo;
		sal=s;
		Tsal = Tsal+sal;
	}
	
	public void Display()
	{
		System.out.println("Employee is =>  "+empNo+"  "+sal);
	}
	
	public static void TotalSal()
	{
		System.out.println("---------------------------------------------");
		System.out.println("Total Salary is => "+Tsal);
		System.out.println("---------------------------------------------");
	}
	
	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		EMP e1 = new EMP(12000.55f);
		e1.Display();
		
		EMP e2 = new EMP(15500.81f);
		e2.Display();
		
		EMP e3 = new EMP(50845.77f);
		e3.Display();
		
		EMP.TotalSal();
	}
	
}
