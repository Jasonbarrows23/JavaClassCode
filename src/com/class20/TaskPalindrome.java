package com.class20;

public class TaskPalindrome {
	
	
	public static void main(String[] args) {
		//Create a method that will take a String and return whether String is palindrome or not.
		//Method should available to all classes within your projects.
		
		TaskPalindrome obj = new TaskPalindrome();
		boolean palin=obj.isPalindrome("Hello");
		System.out.println(palin);
	}
	
	public boolean isPalindrome(String str) {
		
		boolean flag = true;
		String reversed="";
		int length = str.length();
		
		for (int i=length-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		
		if (reversed.equalsIgnoreCase(str) ) {
		   flag =true;
		}
		return flag;
		
	}

}
