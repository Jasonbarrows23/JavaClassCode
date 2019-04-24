package com.class11;

public class Task3 {
	public static void main(String[] args) {
		//create an array of int and find the largest number
		
		int[] numbers= {1,2,3,4,5};
		int largest=numbers[0];
		
		
	//interview questions
		for(int a=0;a<numbers.length; a++) {
			
			if (numbers[a]>largest) {   
				largest=numbers[a];
			}
		}
			System.out.println("The largest number is "+largest);
			
		}
	}

