package com.class12;

public class StringMethods {

	public static void main(String[] args) {
		
		//reverse print
		
		String day= "Sunday";
		
		String reverse = "";
		
		for (int i=day.length()-1; i>=0; i-- ) {
			reverse = reverse + day.charAt(i);
		}
		
		System.out.println(reverse);

	}
}



