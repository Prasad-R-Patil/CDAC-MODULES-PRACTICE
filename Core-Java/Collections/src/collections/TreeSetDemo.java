package collections;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		 t.add(10);
		 t.add(20);
		 //t.add(null); 
		 t.add(30); 
		 t.add(40); 
		 t.add(10);
		 
		/*
		 * t.add(new StringBuilder('A')); t.add(new StringBuilder(10));
		 */

		System.out.println(t);

	}

}
