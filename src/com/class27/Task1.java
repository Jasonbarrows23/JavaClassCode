package com.class27;

public class Task1 {
	//1. Write program as a student class that has instance variables name and address.
	//Create a constructor that will initialize those variables.
	//Print name & address of given  student by the displayInfo method.
	
	String name;
	String Address;

	Task1(String name, String Address) {
		this.name = name;
		this.Address=Address;
	}
	
	public void displayinfo() {
		System.out.println("Student name "+name+" And address is "+Address);
	}
	
	public static void main(String[] args) {
		Task1 tt=new Task1("Jason Barrows", "3404 cali dr l2234");
		tt.displayinfo();
		
	}

}
