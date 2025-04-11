package collections;

import java.util.*;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		
		l.add("Prasad");
		l.add("rohan");
		l.add("Sagar");
		l.add("Vikrant");
		l.add("Tejas");
		l.add("Rohan");
		l.add(null);
		
		System.out.println(l);
		
		l.add(1,"mayur");
		System.out.println(l);
		
		l.add(2,"Chaitali");
		System.out.println(l);
		
		l.addFirst("Monika");
		System.out.println(l);
		
		/*
		 * l.removeAll(l); System.out.println(l);  All list are empty
		 */
		
		l.remove(0);
		System.out.println(l);
		
		
		Iterator<String> itr =  l.iterator();
		
		while(itr.hasNext())
		{
			//String s = (String)itr.next();
			String s = itr.next();
			
			
			if(s.equals("rohan"))
			{
				itr.remove();
			}
			
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
