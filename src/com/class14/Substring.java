package com.class14;

public class Substring {

	public static void main(String[] args) {
		
		// 3 using substring()

		String reverse="";
		String original = "Today is Java Class";
		for(int i = original.length(); i>0; i--) {
			reverse+=original.substring(i-1,i);
		}
		System.out.println("Reverse String is: " + reverse);

		
	}

}
