
public class DefaultValue 
{
	
	private char c;
	private short s;
	private int i;
	private long l;
	private byte b;
	private double d;
	private boolean bo;
	
	public void Display()
	{
		System.out.println(c);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(b);
		System.out.println(d);
		System.out.println(bo);
	}
	
   public static void main(String args[])
   {
	   DefaultValue dv = new DefaultValue();
	   
	   dv.Display();
	   
   }

}
