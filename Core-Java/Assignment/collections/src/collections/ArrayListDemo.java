package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		System.out.println(a.add(20));
		a.add("abc");
		a.add('c');
		a.add(10);
		
		
		for(Object o : a)
		{
			System.out.println(o);
		}
	}
}
