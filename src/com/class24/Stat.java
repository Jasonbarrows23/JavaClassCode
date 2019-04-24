package com.class24;

public class Stat {
	//2.Create 1 class with a static method that has 3 overloaded forms.
	//Then call each overloaded method with specific arguments and observe result.
	
	public static void main(String[] args) {
        Stat.num();
        Stat.num(10);
        Stat.num(5, 4);

    }

    static void num() {
        System.out.println(0);

    }

    static void num(int a) {
        System.out.println(a);

    }

    static void num(int b, int a) {
        System.out.println(a+b);
    }

}
