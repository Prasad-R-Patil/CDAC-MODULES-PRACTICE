
public class Interst {
	
	private float SI;
	private float Amount;
	
	public void SimpleIN(float d)
	{
		Amount =  d;
		
		SI =(float)(Amount*7.75f*5)/100;
	}
	
	public void Display()
	{
		System.out.println("Amount is => "+Amount+ "  SimpleIntest is => "+SI);
		System.out.println("Total Amount include SI is "+ (Amount+SI));
	}
	
	public static void main(String[] args) {
		Interst i = new Interst();
		
		i.SimpleIN(15000.50f);
		i.Display();
	}
	
}
