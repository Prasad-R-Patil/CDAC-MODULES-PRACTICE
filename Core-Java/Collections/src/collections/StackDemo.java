package collections;
import java.util.*;

public class StackDemo {
	
	public static void main(String[] args) {
		
		
		Stack s = new Stack();
		
		s.push(10);
		s.push('A');
		s.push(null);
		s.push(10);
		s.push(20);
		s.push("ABC");
		
		
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		
		System.out.println(s.peek());
		
		System.out.println(s.capacity());
		
		System.out.println(s.size());
		
		System.out.println(s.search("ABC"));
		System.out.println(s.search('A'));
		
		System.out.println(s.get(2));
		
		
		
	}

}
