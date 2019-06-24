package CodingPractice;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		workingWithArrays();
		
		
	}
	
	public static void workingWithArrays() {
		
		char [] letters = {'t', 'o', 'q', 'd', 'c'};
		
		System.out.println(Arrays.toString(letters));
		
		Arrays.fill(letters, 'U');
		
		System.out.println(Arrays.toString(letters));
		
	}
}
