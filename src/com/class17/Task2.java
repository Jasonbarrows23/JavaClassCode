package com.class17;

public class Task2 {

	public static void main(String[] args) {
		
	//Create a method that will take a number and prints whether the number is even or odd.
		
		Task2 obj=new Task2();
		obj.EvenOrOdd(33);

	}
	
	void EvenOrOdd (int num) {
		
		if(num%2==0) {
			System.out.println(num+ " is Even");
		}else {
			System.out.println(num+ " is Odd");
		
		
	}
	}
}
