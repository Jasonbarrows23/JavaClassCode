package com.class17;

public class NoMainMethod {
	//methods and variables are member of the class
	String str;//data members
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
		System.out.println("Hello Ruhullah");
		System.out.println("Hello Sal");
	}
	
	void bye() {
		System.out.println("Bye");
		System.out.println("Bye friends");
	}
	
	public static void main(String[] args) {//method signature
		
		NoMainMethod obj=new NoMainMethod();//method body
		obj.hello();//we calling a method hello
		obj.bye();//we calling a method bye
		
	}
}
