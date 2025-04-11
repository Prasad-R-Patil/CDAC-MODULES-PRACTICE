package collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		if(i1>i2)
		{
			return +1;
		}
		else if(i1<i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
		
	}
	
	
	
	
	

}
