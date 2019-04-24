package com.class14;

public class groupQuestions1 {

	public static void main(String[] args) {
		//1. Write a program to swap 2 numbers without a temporary variable?
		//Swap  2 strings without a temporary variable?
		
		  int x,y,swap;
	        
	        x=5;
	        y=10;
	        System.out.println("X and Y before Swap:" + "x=" + x +" y=" + y);
	        swap = x;
	        x = y;
	        y = swap;
	        
	        System.out.println(" x=" + x +" y=" + y );
	        
	        String a,b,swap1;
	        
	        a="Do a first then b";
	        b="Do b first then a";
	        System.out.println("Before swap a and b: " + a + ", " + b);
	        
	        swap1 = a;
	        a = b;
	        b = swap1;
	        System.out.println("After swap a and b: " + a + ", " + b);

	}

}
