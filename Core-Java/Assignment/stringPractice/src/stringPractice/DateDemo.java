package stringPractice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateDemo {
	
	public static void main(String[] args)throws ParseException {
		
		
		
		System.out.println(new Date());
		
		Date d = new Date();
		
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM//yyyy");
		String str = sf.format(d);
		
		
		System.out.println(str);
		
		Date d1 = sf.parse(str);
		
		System.out.println(d1);
		
		
		
		
		
		
	}
}
