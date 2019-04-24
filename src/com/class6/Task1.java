package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints out if it is good weather to go for any activity.
		 * If the temperature is between 40 degrees and 180 degrees inclusive & no rain -->we will go
		 * OTHERWISE-->WE WILL NOT GO HIKING
		 * If temperature is between 25 and 40 inclusive & snowing-->going snowboarding otherwise
		 * We are not going snowboarding
		 * If the temperature is more than 80 & sunny-->>go to the beach
		 * otherwise--> not go to the beach
		 */
		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a temperature");
		
		temp=input.nextInt();
		
		if (temp>=40 && temp<=80) {
			System.out.println("Is it raining");
			rain=input.nextBoolean();
			if (rain) {
				System.out.println("watch a movie");
	        }else {
	            System.out.println("go hiking");
	        }
	} else if (temp>=25 && temp<40) {
		System.out.println("snowboarding");
		snow=input.nextBoolean();
	    if (snow) {
	    	System.out.println("we are going snowboarding");
	    } else {
	        System.out.println("do coding");
	    }
	} else if (temp>80) {
		System.out.println("Is it sunny");
		sunny=input.nextBoolean();
	    if (sunny) {
	    	System.out.println("go to the beach");
	    } else {
	    	System.out.println("more coding");
	    }
	} else {
	    System.out.println("temperature is not valid");
		
			}
	}
	}
