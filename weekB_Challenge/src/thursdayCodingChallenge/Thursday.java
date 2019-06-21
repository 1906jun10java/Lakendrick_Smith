package thursdayCodingChallenge;
import java.util.Scanner;
import java.util.ArrayList;
public class Thursday {
	
	public static void main(String[] args) {
		
		//Creates the Arraylist of the String type
		ArrayList <String> usernames = new ArrayList <String> ();
		
		// These methods add the names to the Arraylist
		addToQueue(usernames,"David");
		addToQueue(usernames,"Tom");
		addToQueue(usernames,"Bob");
		
		
		
		
		// These next lines are used to print the material to the console
		System.out.println("This is the original list.");
		
		System.out.println("--------------------------");
		
		System.out.println(usernames.toString());
		
		System.out.println(" ");
		
		removeFromQueue(usernames, "Tom");
		
		System.out.println("This is the list with 'Tom' removed");
		
		System.out.println("-------------------");
		
		System.out.println(usernames.toString());
		System.out.println(" ");
		
		addToQueue(usernames,"Tom" );
		
		System.out.println("This is the original list with Tom again. ");
		
		System.out.println("-------------------");
		
		System.out.println(usernames.toString());
		
		System.out.println(" ");
		
		System.out.println("This is the list with David removed at index[0]");
		
		pollQueue(usernames);
		
		System.out.println(usernames.toString());
		
		
	
		
		
		
		
	
		//Scanner sc = new Scanner(System.in);
		
		//String String1 = sc.next();
		
		//String String2 = sc.next();
		//
		//sc.close();
		
		//containsSubstring(String1,String2);
		
		//Boolean Result = containsSubstring(String1,String2);
		
		//if (Result = false) {
			
		//	System.out.println(" They are the same.");
		}
		
		
		
	

	
	public static boolean containsSubstring(String str, String subStr) {
		
		if(str == subStr) {
			System.out.println("The String contains the substring.");
		}
		
		
		
		
		return false;
	}
	
	public int triangle(int numRows) {
		
		return 0;
	}
	//This method adds to the Queue
	public static void addToQueue(ArrayList<String> usernames, String username) {
		
		usernames.add(username);
		
	}
	// This method takes from the queue
	public  static void removeFromQueue(ArrayList<String> usernames, String username) {
		
		
		usernames.remove(username);
		
		
	}
	// This method removes the index
	public static void pollQueue(ArrayList<String> usernames) {
		
		usernames.remove(0);
	}
	
	
}
