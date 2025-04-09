package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		System.out.println(a.add(20));
		a.add(30);
		a.add(null);
		//a.add("abc");
		//a.add('c');
		a.add(10);
		
		//System.out.println(a.size());
		
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		System.out.println(a.get(2));
		
		
		
		
		
		
		
		
		
	}
}
