package com.class8;

public class FoorLoop {

	public static void main(String[] args) {
		
		//initialize	conditions/testConditions  increment/decrement
		
		for(int i=10		;i<=20		; 				i++) {
			System.out.println("Good morning"+i);
		}
		
		//*I want to print numbers from 10 to 1
		
		for(int i=10; i>=1; i--) {
			
			System.out.println(i);
		}

		//*What is the output?*/

		for(int a=0; a<=20; a+=2) {
			System.out.println(a);
		}
		
		for(int b=1; b<=50; b+=1) {
			System.out.println(b);
		}
}	
}