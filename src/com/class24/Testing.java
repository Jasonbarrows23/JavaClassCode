package com.class24;

public class Testing {

	public static void main(String[] args) {

		String a;
		a = "10";
		
		double d2;
		
		Parent parent = new Parent();
		parent.love();
		parent.work();
		
		Child child	=new Child();
		child.love();
		child.cry();
		child.work();
		
		//type casting
		//Child obj1 = new Parent(); not possible
		
		Parent obj = new Child();
		obj.work(); //Parents work
		obj.love(); //Child love
		//obj.cry();not accessible

	}

}
