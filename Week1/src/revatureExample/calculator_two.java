package revatureExample;

import java.util.Scanner;

public class calculator_two {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Put in your first number.");
	
	
		
	
	double num1 = sc.nextDouble();
	
	 
		
		
	
		
	
	System.out.println(" ");
	
	
	System.out.println("put in your second number.");
	double num2 = sc.nextDouble();
	
	System.out.println("put in your operator.");
	String value = sc.next();
	
	System.out.println("");
	
	
	
	sc.close();
	
	Calculation(num1, num2, value);
	
	}

	
		
		
		public static double Calculation(double a, double b, String value) {
			
			
			
			
			
			switch (value) {
			
			case "+" :
				
				double total = a + b;
				System.out.println(total);
				return total; 
			
			case "-" :
				double difference = a - b;
				System.out.println(difference);
				return difference;
				
			case "/" :
				double divide = a /b;
				System.out.println(divide);
				return divide;
				
			case "*" :
				double multiplication = a * b;
				System.out.println(multiplication);
				return multiplication;
				
			}
			return 0;
				
		}			
}		
		
					
		

