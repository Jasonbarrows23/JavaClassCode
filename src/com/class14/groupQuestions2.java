package com.class14;

public class groupQuestions2 {

	public static void main(String[] args) {
		
		//2 .Write a java program to find the second largest number in the array? 
		//Maximum and minimum number in the array?

		int [] array = {1,5,2,3,8,5,9};
		        
		        int largest=array[0];
		                
		        int min = array[0];
		                
		        int secondLargest=0;
		        
		        for (int i=0; i<array.length; i++) {
		            
		            int num = array[i];
		        
		        if (num>largest) {
		            secondLargest=largest;
		            
		            largest = num;
		        }else if (num>secondLargest) {
		            
		            secondLargest = num;
		        
		        }else if (num<min) {
		            
		            min = num;
		        }
		        
		        }
		        System.out.println("The second largest number in the array is " +secondLargest);
		        System.out.println("The largest number is the array is " + largest);
		        System.out.println("The smallest number in the array is " +min);

	}

}
