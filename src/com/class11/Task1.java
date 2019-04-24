package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		//create an array of cars and store 6 elements into it.Using 2 different loops prints all values from the array
		
		String[] cars=new String[6];
				cars[0]="Bmw";
				cars[1]="Mercedes";
				cars[2]="Audi";
				cars[3]="Lambo";
				cars[4]="VW";
				cars[5]="Honda";
		for (int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println();
		for (String all:cars) {
			System.out.println(all+" ");
		}
	}
}

		
		
		
									

