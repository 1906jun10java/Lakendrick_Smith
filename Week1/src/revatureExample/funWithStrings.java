package revatureExample;

public class funWithStrings {
	
	public static void main(String[] args) {
		
		//create a new String
		String a = "hello";
		String b = new String("hello");
		/*
		 * 
		 * .equals() - 
		 */
		
		System.out.println("String a is equal to string b: " +a.equals(b));
		
		
		
		System.out.println("String a is the same object as String b: "+ (a == b));
		
		// a and b are different objects which point to the same literal
	}

}
