package fizzBuzzAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class fizzBuzz {
	
	// we will create a method that will print out "fizzbuzz" sometimes.
	
	public static void fizzBuzzBasic () {
		
		// we will create a for loop to get the interations of 1 - 100.
		
		for (int i = 0; i<100; i++) {
		
			// Now will make if-else statements to decide to put fizz, buzz, fizzbuzz or just i.
			
			if  (i % 3 == 0 &  i % 5 == 0) {
				
				System.out.println("fizzbuzz");
				
			}
			else if (i % 3 == 0) {
				System.out.println("fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		
		}
		System.out.println("This is the end of the orignal fizzBuzz.");
	}
	public static void fizzBuzzAdvanced () {
		
		// These are the arrays for the fizzBuzzAdvanced

	
		int [] m =  {2,3,5};
		String [] n = {"do", "ve","mi"};			
		// we will ask the user the range
		
		System.out.println("What is the range of this loop for the Advanced fizzbuzz?");
		
		Scanner sc = new Scanner(System.in);
		int range  = sc.nextInt(); 
		sc.close();
		
		 
		
		
		// Will will use a for loop to determin our outputs
		for (int i = 0; i< range; i++) {
			
			if (i % 2 == 0 & i % 3 == 0 & i % 5 == 0) {
				System.out.println(n[0] + " " + n[1] + " " + n[2]);
			}
			else if (i % 2 == 0) {
				System.out.println(n[0]);
			}
			else if (i % 3 == 0) {
				System.out.println(n[1]);
			}
		   else if (i % 5 == 0) { 
			   System.out.println(n[2]);
		}
		   else {
			   System.out.println(i);
		   }
		}	
	}
				
			
				
			
			
			

		 
	// this is our main method
	public static void main(String[] args) {
		
		
		fizzBuzzAdvanced();
	}
}


