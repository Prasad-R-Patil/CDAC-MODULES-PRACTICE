package stringPractice;

public class StringDemo {
	public static void main(String[] args) {
		
		String str = "Java";
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		String str3 = new String("java");
		
		System.out.println(str==str1); //false
		System.out.println(str1==str2); //True
		System.out.println(str==str3); //false ASCII value
		
		str = str.concat(" Trainer");
		System.out.println(str);
		
		System.out.println("Char At 2 => "+(str.charAt(2)));
		
		System.out.println("compartr => " + str.compareTo(str3));
		System.out.println(str3);
		
		System.out.println("Triam " +str3.trim() );
		
		System.out.println(str.substring(1,5));
	}

}
