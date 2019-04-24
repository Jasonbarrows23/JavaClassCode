package com.class16;

public class Car {
	
	//Features
	//action
	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
	//ClassName variable=new ClassName();
	//1st Object
	
	Car car1=new Car();
	
	System.out.println("---First Object---");
	
	
	car1.make="Honda";
	car1.model="Civic";
	car1.color="Black";
	car1.door=4;
	car1.wheels=4;
	System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
	
	//define behavior
	car1.drive();
	car1.reverse();
	car1.stop();
	
	
	
	
	//2nd Object
	Car car2=new Car();
	
	System.out.println("---Second Object---");
	
	
	car2.make="Bmw";
	car2.model="M3";
	car2.color="Black";
	car2.door=2;
	car2.wheels=4;
	System.out.println("My "+car2.make+" "+car2.model+" is "+car2.color+" ");
	
	car2.drive();
	car2.reverse();
	car2.stop();
	
	
	}
	
	
	//Behavior
	void drive() {
		System.out.println("Car can drive");
	}
	
	void reverse() {
		System.out.println("Car can reverse");
	}
	
	void stop() {
		System.out.println("Car can stop");
		
	}
}
