package stringPractice;

public class Demo3 {
	
	public static void main(String[] args) {
		
		String str = "Java is a object oriented Programming";
		
		String[] s = str.split("\\s");
		
		//String[] s = str.split(0);
		
		for(String s1 : s)
		{
			System.out.println(s1);
		}
		
		
	}
}


