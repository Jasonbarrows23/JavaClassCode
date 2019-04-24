package com.class5;

import java.util.Scanner;

public class LogicalPracticeTwo {

	public static void main(String[] args) {
		
		Scanner Input;
		int quiz;
		int midterm;
		int finalscore;
		int avgscore;
		
		Input= new Scanner(System.in);
		System.out.println("quiz score");
		quiz=Input.nextInt();
		
		Input= new Scanner(System.in);
		System.out.println("midterm score");
		midterm=Input.nextInt();
		
		Input= new Scanner(System.in);
		System.out.println("final score");
		finalscore=Input.nextInt();
		
		avgscore= ((quiz +midterm +finalscore)/3);
		
		if (avgscore>=90) {
			System.out.println("Your grade is A");
		}else if (avgscore>=70 && avgscore<90) {
			System.out.println("Your grade is B");
		}else if (avgscore>=50 && avgscore<70) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Your grade is F");
		}
		}
		
}
