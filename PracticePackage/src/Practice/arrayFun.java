package Practice;

public class arrayFun {
	
	public static void main(String[] args) {
		
		
		int [] array1 = {5,9,7};
		int [] array2 = {9,2,4};
		
		System.out.println(sumArray(array1));
	}

	
	public static int sumArray( int [] num1) {
	
		
	int totalOfArray = 0;
	
	for(int i = 0; i < num1.length; i++ ) {
		
		totalOfArray = totalOfArray + num1[i];
		
	}
	
	for(int i = 0; i < num2.length; i++) {
		
		totalofArray = totalOfArray + num2[i];
	}
	return totalOfArray;
		
		
		
		
	}
}
