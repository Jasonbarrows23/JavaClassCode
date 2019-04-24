package com.class17;

public class Task1 {

	public static void main(String[] args) {
		
		//Create a method that will take 2 parameters as a numbers and prints which number is larger.
		
		Task1 obj =new Task1();
		obj.largestNumber(1000,2000);

	}
	
	void largestNumber (int a, int b) {
		
		if(a>b) {
			//Many options
			//return a;
			System.out.println("A is larger than B");
		}else {
			//return b;
			System.out.println("B is larger than A");

		}
}
}
