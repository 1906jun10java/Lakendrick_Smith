package week1_Challenge;
import java.util.Scanner;
import java.util.Arrays;

public class Mutations {
	
	public static void main(String[] args) {
		
		// first will open the Scanner to recieve input.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the starting sequence?");
		
		// now will get user input to get the starter sequence.
		String start = sc.nextLine();
		
		System.out.println("What is the ending sequence?");
		
		// will get user input to get the end sequence
		String end = sc.nextLine();
		
		
		
		// converts the given strings to set up the Bank for the 
		//start and end to be compared to and it also ask for the user to put in input.
		
		System.out.println("Enter the first bank");
		String firstBank = sc.nextLine();
		
		System.out.println("Enter the second bank");
		String secondBank = sc.nextLine();
		
		System.out.println("Enter the third bank");
		String thirdBank = sc.nextLine();
		
		
		
		// create an array out Strings given from the users.
		
		String [] Bank = {firstBank, secondBank, thirdBank};
		
		System.out.println(" ");
		System.out.println("This is the starter sequence:");
		System.out.println("-----------------------------------");
		System.out.println(" ");
		
		System.out.println(start);
		
		System.out.println(" ");
		System.out.println("This is the ending sequence:");
		System.out.println("-------------------------------------");
		System.out.println(" ");
		System.out.println(end);
		
		System.out.println(" ");
		
		System.out.println("This is your bank in an array");
		System.out.println("---------------------------------------");
		System.out.println(" ");
		System.out.println(Arrays.toString(Bank));
		
		
		//numberOfMutations(Bank, start, end );
		
		
		
		
	}
	
	
	

}
