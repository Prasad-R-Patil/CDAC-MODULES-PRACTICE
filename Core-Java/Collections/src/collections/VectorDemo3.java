package collections;
import java.util.*;
public class VectorDemo3 {
	
	public static void main(String[] args) {
		
		
		//Vector v = new Vector(20);
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());
		
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		//v.set(2, -2);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) 
		{
			int i= (int)e.nextElement();
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			
			
		}
		
		v.add(null);
		System.out.println(v);
		
		
		System.out.println(v.contains(5));
		
		System.out.println(v.get(4));
		
		
		
		
		
	}

}
