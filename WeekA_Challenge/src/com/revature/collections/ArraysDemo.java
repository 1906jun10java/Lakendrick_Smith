package com.revature.collections;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		// create a 2D array of ints
//		int[][] arr1 = new int[10][10];
		
		// really creating an array of arrays
		int[][] arr1 = new int[10][10];
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		//for(int i = 0; i < arr2.length; i++) {
			
			//for(int j=0; j<arr2[i].length; j++) {
				
				//System.out.println("i = " + i);
				//System.out.println("j = " + j);
				//System.out.println("arr2[i][j] = " + arr2[i][j]);
			//}
		//}
				
		System.out.println(LargestElement(arr2));
	}
	
	public static int LargestElement(int[][] arr) {
		
		int largestNumber = 0;
		for(int i = 0; i < arr.length; i++) {
			
				for(int j=0; j<arr[i].length; j++) {
				
					if(arr[i][j] > largestNumber) {
					
						largestNumber = arr[i][j];
					}
				
				}
		}
		return largestNumber;
			
				
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	public static int sumElements(int[][] arr) {
		
		int totalElements = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				totalElements = totalElements + arr[i][j];
			 
			}
		}
				
		return totalElements;
	}
	
	public static int sortArrays(int[][] arr) {
		
		
	}

	}	
