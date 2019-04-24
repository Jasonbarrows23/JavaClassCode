package com.class11;

public class Recap {

	public static void main(String[] args) {
		// let's create an array of names that will hold 5 elements and retrieve all values
		// 1. creating an array with new keywords
		String[] names=new String[7];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Wegas";
		names[4]="Dzmitri";
		names[5]="Shiva"; //will get an runtime exception when trying to access it
		names[6]="Sandesh";
		
		for (int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//2. creating an array using array literal
								// 0         1     2      3      4      5
		String[] studentNames= {"Ruhullah","Sal","Abel","Drew","Josh","Ruben"};
		
		System.out.println("----For loop----");
		for (int i=0; i<=studentNames.length-1; i++) { //minus 1 because she put equal
			System.out.println(studentNames[i]);
		}
		
		// retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("----Advance for loop----");
		for (String student:studentNames) {
			System.out.println(student);
		}

	}

}
