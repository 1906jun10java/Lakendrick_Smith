package javaCalculator;

import java.util.Scanner;

public class inputs {

	public static void main(String[] args) {
		
		
		
		
		// We will create 2 instance varible to use for the scanner method
		
		double num1, num2;
		
		int cont = 1;
		
		
		
		// We will open up the scanner method
		Scanner sc = new Scanner(System.in); 
		
		// we will use this to ask the user if they want to continue with loop
		
		
		
		// Now will attach the user input to the instance varibles
		
			
		
		System.out.println("Input your first number: ");
		
		num1 = sc.nextDouble();
		
		System.out.println("Input your second number: ");
		
		num2 = sc.nextDouble();
		
		System.out.println("input your operation: ");
		
		// Now we will  attach the user input to a character instance varible
		char c = sc.next().trim().charAt(0);
		
		
		// Now we will create switch statements to do our operations
		
		
		
		
		int loopcount;
		System.out.println("enter loop count: ");
		loopcount = sc.nextInt(); 
		sc.close();
		
		int i = 0;
		
		
		while (i < loopcount) { 	
			
			
		 
		
			// now will do our operations by using switch statements
		
			switch (c) {
		
			case '+': 

					double answer = num1 + num2;
					System.out.println( answer);
					break;

					
					
			
			 	case '-':
			
			 		double subtraction = num1 - num2;
			 		System.out.println( subtraction);
			 		break;
			 		
			 		
			
			 	case '*':
			
			 		double multiplication = num1 * num2;
			 		System.out.println( multiplication);
			 		break;
			 		
			 		
			
			 	case '/':
			
			 		double division = num1 / num2;
			 		System.out.println(division);
			 		break;
			 		
			 		
			
			 		
			 		
			 		
			 		
			 		
				
			 		
			}	i++;
				
		}
		
		
		
		}
		
		
		
		
		
		}
