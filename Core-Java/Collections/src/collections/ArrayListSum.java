package collections;


import java.util.Arrays;
import java.util.List;

public class ArrayListSum {
	
	public static void Sum(List<? extends Number> l)
	{
		System.out.println(l);
		
		int sum =0;
		
		for(Number i : l)
		{
			Integer a = (Integer)i;
			
			sum+=a;
		}
		
		System.out.println("Sum is => "+sum);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		ArrayListSum.Sum(list);
		
		// list.add(777); java.lang.UnsupportedOperationException
		
	}

}
