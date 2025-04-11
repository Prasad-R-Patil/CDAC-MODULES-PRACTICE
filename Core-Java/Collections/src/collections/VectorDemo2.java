package collections;
import java.util.*;
public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		
		//Vector v = new Vector(20);
		Vector v = new Vector();
		
		System.out.println(v.capacity());
		
		for(int i=0; i<10; i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) 
		{
			int i= (int)e.nextElement();
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			
			
		}
		System.out.println(v);
		
		
		
		
		
	}

}
