package com.class8;

public class Task {

	public static void main(String[] args) {

		//print numbers from 1 to 100
		
		for(int a=100; a>=1; a--) {
			System.out.println(a);
		}
		
		//print numbers from 100 to 1
		
		for(int b=1; b<=100; b++) {
			System.out.println(b);
		}
		
		//print odd numbers from 1 to 20(2 ways)
		
		for(int c=1; c<=20; c+=2) {
			System.out.println(c);
		}
		
		//print even numbers from 20 to 1(2ways)
		
		for(int d=20; d>=1; d-=2) {
			System.out.println(d);
		}
		
		//print even numbers between 20 and 50(2 ways)
		
		for(int e=20; e<=50; e+=2) {
			System.out.println(e);
		}
		
		//print odd numbers between 20 and 50(2way)
		
		for(int f=20; f<=50; f++) {
			if(f%2==0) {
			System.out.println(f);
		}
	}
}
}
