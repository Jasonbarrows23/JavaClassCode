package com.class8;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan;
		double price;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
			
			System.out.println("I am inside the loop");
			
		}while(price!=1.99);
		
		System.out.println("I am outisde the loop");
		
		System.out.println("Please enjoy you soda");
	}
}
