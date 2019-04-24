package com.class17_2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
//Write a guessing game where the user has to guess a secret number between 1 and 20.
//After every guess input, the program tells the user whether their number was too large or too small.
//The program will keep asking the user to enter the number until he finds the correct number.
//When the correct answer is found the system should display "Congratulations!!. You got it!".

		 int x, y, input;
	        y = 7;

	        Scanner value = new Scanner(System.in);
	        System.out.println("Enter a number");
	        input = value.nextInt();
	        while (input != y) {
	            if (input < y) {
	                System.out.println("your number too small");
	                input = value.nextInt();
	            } else if (input > y) {
	                System.out.println("your number too big");
	                input = value.nextInt();

	            }
	        System.out.println("Congratulations!!. You got it!");
	    }
	}
}
