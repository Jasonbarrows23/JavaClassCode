package com.class14;

public class groupQuestions5 {

	public static void main(String[] args) {
		
		//5. Write a java program to reverse String? Reverse a string word by word?
		

				String reverse="";
				String beforeReverse = "Today in Java Class I will be reversing a string";
				
				for(int i = beforeReverse.length(); i>0; i--) {
					reverse+=beforeReverse.substring(i-1,i);
				}
				System.out.println("Reverse String is: " + reverse);

	}

}
