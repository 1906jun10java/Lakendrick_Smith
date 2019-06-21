package weekB_Challenge;

import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {
		// we will call the ReverseString method to get the result to pring to screen
		
		ReverseString();		
		
		
		
		
	}
	public static String ReverseString() {
		
		// Ask the user what String they want to be reversed
		System.out.println("Please hurry up and type something out to be reversed lol: ");
		
		//Use scanner to get the input of the user
		Scanner sc = new Scanner(System.in);
		// We scanned the string to be put inside of the reference variable String1
		String String1 = sc.next();
		
		// This line turns the String1 variable and turns the String value into an Array
		String1.toCharArray();
		
		// This for loop is used to interate through the array of characters we just created and scans backwards.
		for(int i = String1.length()-1; i>=0; i--) {
			
			// This line prints out the individual characters at each index of the array
			System.out.println(String1.charAt(i));
			
			// we close the scanner method
			sc.close();			
			
		}
		// return String1
		return String1;
		
	}
}
		
			
		
		
	
			
			
			
		
	
 



