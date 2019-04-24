package com.class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		//6. Ask a user to input a leap year.
		//Give the user 10 chances to enter a correct leap year.
		//As soon as the user enters the correct leap year exit the loop.
		
		Scanner input;
		int leapYear;
		
		input=new Scanner(System.in);
		
		for (int a=1; a<=10; a++) {
			System.out.println("Please enter your guess leap year");
			leapYear=input.nextInt();
			
			if (leapYear%400!=0) {
				System.out.println(leapYear + " Your guess wrong.");
			
			}else if (leapYear%400==0) {
				System.out.println("Congratulations!!. You got it!");
				break;
			}
		}
	}

}
