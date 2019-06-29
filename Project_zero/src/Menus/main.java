package Menus;
import come.revature.beans.*;
import com.revature.*;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		/*
		 * prompt the welcome menu and ask the user
		 * for their username and password.
		 */

		boolean signedIn = true;
		while(signedIn) {
		System.out.println("Welcome to the site! Below, enter your username and password.");
		System.out.println("-------------------------------------------------------------");

		System.out.println(" ");
		System.out.println("Enter Username: ");
		System.out.println("--------------");

		//opens up the scanner for user input
		Scanner sc = new Scanner(System.in);

		String username = sc.nextLine();


		System.out.println(" ");
		System.out.println("Enter Password: ");
		System.out.println("---------------");


		String password = sc.nextLine();

		// Asks the user if their an employee or customer.		
		System.out.println("Are you an employee or customer? 1.for Employee and 2. for Customer");
		System.out.println(" ");

		int question = sc.nextInt() ;
		// these are used to decide what menu to show.
		int answerCustomer = 2;
		int answerEmployee = 1;

		// this will display the employee menu.
		if (question == answerEmployee ) {

			System.out.println("Welcome to the employee portal. Choose your options below.");
			System.out.println("---------------------------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Add or remove a car.");
			System.out.println("3. Accept or reject offer.");
			System.out.println("4. Sign out.");

			// This is used to access the options on the employee menu.
			int choice = sc.nextInt();
			boolean switchControl2 = true;
			while(switchControl2) {
				switch (choice) {

				case 1:

					break;

				case 2:

					break;

				case 3:

					break;

				case 4:
					switchControl2 = false;
				
				

			}
			}
		}

		else if (question == answerCustomer) {

			System.out.println("Welcome to CARS'R US. Below are your main menu options.");
			System.out.println("-----------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Make an offer on a vehicle.");
			System.out.println("3. View cars that I own.");
			System.out.println("4. View remaining payments on cars that I own");
			System.out.println("5. sign out");
			
			int choice = sc.nextInt();
			boolean switchControl1 = true;
			
			while (switchControl1) {
				
			
				switch (choice) {

				case 1:

					break;

				case 2:

					break;

				case 3:

					break;

				case 4:
				
					break;
				
				case 5:
				
					switchControl1 = false;

				}

			}
	 }	
			
		System.out.println(" ");
		System.out.println("Thanks for coming!!!");
		System.out.println(" ");
	}
		
  } 

	
}
