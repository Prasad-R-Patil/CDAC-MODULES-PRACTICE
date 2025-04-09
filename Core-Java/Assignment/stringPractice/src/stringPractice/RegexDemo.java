package stringPractice;

import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Pattern.matches("..a", "ja"));
		System.out.println(Pattern.matches("[abc]*", "abc"));
		System.out.println(Pattern.matches("[^xyz]*", "Prasad"));
		
		
	}
}
