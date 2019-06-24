package weekBRepository;
import java.util.*;
public class weekB_challenge {
	
	public static void main(String[] args) {
	
		
		System.out.println("This is an example of a balanced Statement");
		
		// this creats our first instance varible
		String String1 = "{[( )]}";
		
		System.out.println(String1);
		
		// this creats our second instance varible
		String String2 = "{{(([[";
		
		// this creats our third instance varible
		String String3 = "{)}([]";
		
		System.out.println(determineEquality(String1, String2));
		
		
	}
	
	public static String determineEquality(String str1, String str2) {
		
		String Equality = "yes";
		
		
		
		if (str1 == str2) { 
		
			
			System.out.println(Equality);
		
		}
		return Equality;
	}
}

