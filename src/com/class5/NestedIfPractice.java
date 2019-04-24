package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		/*
		 * Check if user has credit car-->
		 * Check what is the balance if balance is more than 1000-->payoff
		 * else "you are good"
		 * 
		 */
		
		boolean creditCard=true;
		int balance =900;
		
		if (creditCard) {
			System.out.println("Let's check the balance");
			if(balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are safe");
			}
		}else {
			System.out.println("Do you want a credit card");
		}

	}

}
