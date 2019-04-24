package com.class2;

public class VariableChange {

	public static void main(String[] args) {

		String name = "John";

		String lastName = "Smith";

		char grade = 'B';
		//char grade ='A'; do not work
		
		grade='A';

		String city = "Fairfax";
		
		System.out.println(city);

		
		city="New York";//value of the variable is changed
		
		System.out.println(city);
		


	}
}
