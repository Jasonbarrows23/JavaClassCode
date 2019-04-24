package com.class21;

public class Employee {

	
		//Create a Class called Employee:
		//Create three  variables  eID , salary and set the CEO to “Sumair”
		//Create two objects of the class Employee
		//Set the value of eID, salary for each of the objects
		//Print out the eID , salary and  CEO for each of the objects
		
		static String CEO="Sumair";
		int eID;
		int salary;
		
		public static void main(String[] args) {
			
		Employee e1=new Employee();
		e1.eID=12345;
		e1.salary=85000;
		e1.getEm();
		
		Employee e2=new Employee();
		e2.eID=54321;
		e2.salary=95000;
		e2.getEm();
		
		

	}
		public void getEm() {
			System.out.println("This employee "+eID+ " salary is "+salary+ " and the CEO is " +CEO);
		}

}
