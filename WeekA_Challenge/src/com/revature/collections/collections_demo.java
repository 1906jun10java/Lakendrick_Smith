package com.revature.collections;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.revature.model.*;//

public class collections_demo {
	
	public static void main(String[] args) {
		
		funWithMaps();
	}
	
	public static void funWithIterator() {
		
		Set<userSet> = new HashSet<> ();
		User u1 = new User("Gandalf", "Grey","mithrandir", "you_shall_not");
		user u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		/*
		 * Iterator
		 * 
		 * 
		 */
		
		Iterator<User> userIterator = UserSet.iterator9);
		while(userIiiterat.nexlt)
	}
	
	public static void funWithMaps() {
		
		/*
		 * Map
		 * 
		 * -objdect which maps keys to values
		 * -no diplicate keys
		 * -evey key may map to at most one value
		 * -most implementations allow keys to be null
		 * 
		 * 
		 * 
		 * 
		 */
		Map<String, String> credentialsMap = new HashMap<>();
		credentialsMap.compute("mithrandir", "you_shall_not");
		credentialsMap.put(null, "");
		credentialsMap.put("bono", null);
		credentialsMap.put("bono2", null );
		credentialsMap.put("doc10", "tardis");
		
		System.out.println(credentialsMap.get("doc10"));
		
		for (Map.Entry<String, String> entry : credentialsMap.entrySet()) {
			System.out.println("Key: " +entry.getKey()+ ", Value: ");
		}
	
	}
	
	public static void funWithQueues() {
		
		/*
		 * 
		 * Que
		 * 
		 * typically for holding elements as they are waiting to get processed
		 * provide method for adding, inserting, removing and inspecting elements
		 * -two versions for each of these behaviors: one which throws an exception if the operation fails,
		 * and one which does not.
		 * -FIFO (fisrst-in, first- out, except for PriorityQue, which uses a Comparator or elements' natural ordering
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
		 * 
		 * 
		 */
		
		Queue<userQueue> userQue = new LinkedList<>();
		
		User u1 = new User("Gandalf", "Grey","mithrandir", "you_shall_not");
		user u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		userQue.add(u1);
		userQue.add(u2);
		userQue.add(u3);
		userQue.acc(u1);
		
		while (userQue.size() !=0) {
			System.out.println("queue size: "+userQue.size());
			System.out.println("Processing: "+ userQue.poll()); // removes and returns head of queue
			
		}
	}
	
	public static void funWithSets () {
		
		/*
		 * Set:
		 * 
		 * - Sets are not ordered
		 * - Duplicate elements are not allowed
		 * - Two sets are equal if they have the same elements (enforced by equals() and hashcode() implementations)
		 * 
		 */
		Set<User> userSet = new HashSet<>();
		User u1 = new User("Gandalf", "Grey","mithrandir", "you_shall_not");
		user u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);
		
		// no duplicats... addition of fuplicate elements ewill be ignored.
		userSet.add(u1); // same object (according to ==) as an existing element
		
		User u4 = new User ("David", "Tennant", "doc10", "tardis");
		userSet.add(u4);
		
		// both are ignored, it's the .equals() comparison that's being used (equality,not identity)
		
		for (User user : userSet) {
			
			System.out.println(user);
		}
	}

	public static void funWithLists() {
		
		/*
		 * List:
		 * 
		 * -Lists are ordered Collections
		 * -Duplicate elements are allowed
		 * 
		 * Some additional List features (beyond methods defined in Collection):
		 * -Postional access: acces/manipulate elements absed on position in List
		 * -search: search for an element and retrieve its numerical postion
		 * -Iteration: ListIterator() expands on capablilities of Iterator
		 * -Range-view: access/manipulate subsets of the List
		 * 
		 * https://docs.oracle.com/jav
		 * 
		 */
		List<User> users = new ArrayList<>(); 
		// generally want to use the supertype of Collection
		// User is the type of each element in the List, replaces the generic type paramet in List<E>
		User u1 = new User("Gandalf", "Grey","mithrandir", "you_shall_not");
		user u2 = new User("Paul", "Hewson", "bono", "u2RuleZ");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		// we hava a addAll() method, but it takes a Collection
		
		// duplicates are allowed, so the following should work:
		
		for (User user : users) {
			System.out.println(user);
		}
		
		System.out.println("Size of List: " + users.size());
		
		System.out.println("-----------------------------");
		
		// List of integers
		List<Integer> intergerList = new Vector<>();
		// must use wrapper class Integer to have numeric values
		// wrapper class - datatpe which wraps around a primitive value
		// every primitive datatype has a corresponding wrapper class
		
		integerList.add(10); // implicitly converting from int (primitive) to Integer (object). This is called autoboxing
		integerList.add(-255);
		integerList.add(new Interger(9)); // this is Not autoboxing!
		integerList.add(75);
		integerList.add(-12);
		
		System.out.println("integer list, in insertion order");
		
		for (Integer integer : integerList ) {
			
			System.out.println(integer);
		}
		
		/*
		 * Collections utility
		 * objects. 
		 * sort() method:
		 * must be used with a Collection of Comparable elements
		 * (or be provided a Comparator for that datatype)
		 */
		 Collections.sort(integerList);
		 
		 System.out.println("integer list, sorted");
		 
		 for (Integer integer : integerList) {
			 
		 }
		
 		
	}

}
