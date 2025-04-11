package collections;
import java.util.*;
public class TreeSetDemo4 {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		
		
		
		
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(10);
		
		System.out.println(t);
		
	
		
		
		
		
		
		
	}
}
