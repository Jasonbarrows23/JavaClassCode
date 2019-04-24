package com.class7;

public class CompondOperators {

	public static void main(String[] args) {

		int a=10;
		a=a+10;
		System.out.println(a);//20
		
		int b=100;
		b=b+100;
		System.out.println(b);//200
		
		int c=100;
		c+=100;//c=c+100;
		System.out.println(c);
		
		c+=35;//c=c+35;
		System.out.println(c);
		
		c+=50;//c=c+50
		System.out.println(c);//285
		
		int d=30;
		d-=10;//d=d-10
		System.out.println(d);
		
		d+=50;//d=d+50;
		System.out.println(d);
		
		d/=5;//d=d/5;
		System.out.println(d);//14
		
		d%=4;
		System.out.println(d);//2
		
		/*
		 *1. Decalare variable and increase by 100 using shorthand operator
		 *2. Declare variable and decrease by 67 using shorthand
		 *3. Declare variable cakePiece=11 and divide cakePiece between 4 using shorthand
		 *   each person should get an equal piece of cake
		 *4.Declare variable cakePiece=25 and divide cakePiece between 7 people
		 *  using shorthand operator found out how many pieces of cake left after it was district
		 */
		
		int cakePiece=11;
		cakePiece /=4;
		
		System.out.println("Every person got "+cakePiece);
	}
}
