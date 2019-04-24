package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 23;
		int num2 = 14;

		if (num1 > num2) {
			System.out.println("num1 is larger than num 2");
		} else {
			System.out.println("num1 is smaller than num 2");
		}

		int num3 = 23;
		int num4 = 13;

		if (num3 > num4) {
			System.out.println("num3 is larger than num4");
		} else if (num3 == num4) {
			System.out.println("num3 is equal to num4");
		} else {
			System.out.println("num3 is smaller than num4");
		}

		int day = 5;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday- funday");
		} else if (day == 6) {
			System.out.println("Saturday - code day");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("I do not know what you mean");
		}
	}
}

