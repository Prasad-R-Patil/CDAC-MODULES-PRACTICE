package collections;
import java.util.*;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();
		
		h.add(10);
		h.add('A');
		h.add(20);
		h.add(20.54f);
		h.add(null);
		
		System.out.println(h.add(2));
		
		System.out.println(h);
		
		
		
		
		
		
		
		
		
	}
}
