package collections;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		
		l.add("Prasad");
		l.add("Sagar");
		l.add("Vikrant");
		l.add("Tejas");
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
