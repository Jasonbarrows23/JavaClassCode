package com.class17;

public class Task3 {

	public static void main(String[] args) {
		//Create a method that will print whether given String is palindrome or not.
		
		Task3 obj=new Task3();
		obj.palindrome("kabak");
		
	}
	void palindrome(String string) {
		String reverse = "";
		for(int i=string.length()-1;i>=0;i--) {
			
			reverse =reverse+ string.charAt(i);
			
		}
		if (reverse.equalsIgnoreCase(string)) {
			System.out.println(string+" is palindrome");
		}
	}

}
