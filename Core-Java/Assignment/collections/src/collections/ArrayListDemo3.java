package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		List l = Collections.synchronizedList(a);
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10; i++)
		{
			a.add(s.nextInt());
		}

		
		/*
		 * a.add(10); a.add(20); a.add(30); a.add(null);
		 */
		
		
		System.out.println(a);
		
		l.addAll(a);
		
		//l.clear();
		//a.removeAll(a);
		
	
		System.out.println(l);
		System.out.println(a.contains(30));
		
		
		
		
		
		
		
		
		
		
	}
}
