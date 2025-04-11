package collections;
import java.util.*;
public class VectorDemo {
	
	public static void main(String[] args) {
		
		
		//Vector v = new Vector(20);
		Vector v = new Vector();
		
		System.out.println(v.capacity());
		
		for(int i=0; i<10; i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		v.add('a');
		System.out.println(v);
		System.out.println(v.capacity());
		
		
		
		
		
	}

}
