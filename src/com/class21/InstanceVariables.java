package com.class21;

public class InstanceVariables {
	
	String name="John"; //InstanceVariable can have access modifiers
  //protected
  //public
  //Private
	
	public static void main(String[] args) {
		
	//LocalVariable
		String name="Anna";
		System.out.println(name);
		System.out.println("---Changing value of local variable---");
		
		name="Olga";
		System.out.println(name);
		//creating 1 object
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		System.out.println("---Changing value of instance variable---");
		obj.name="Jack";
		System.out.println(obj.name);
		//creating second object
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
		obj1.hello("Michael");
	}
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

}
