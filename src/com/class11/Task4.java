package com.class11;

public class Task4 {

	public static void main(String[] args) {
		//2D array where you will store the following values; Mr,Mrs,Ms,Miss and Smith,Jordan,Jackson, Obama.
		//After storing values print the following Mrs Smith,Mr Obama,Ms Jackson,Miss Jordan.
		
		String[][]groups= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"},
				};
		
		System.out.print(groups[0][1]+ " ");
		System.out.println(groups[1][0]);
		
		
		System.out.print(groups[0][0]+ " ");
		System.out.println(groups[1][3]);
		
		System.out.print(groups[0][2]+ " ");
		System.out.println(groups[1][2]);
		
		System.out.print(groups[0][3]+ " ");
		System.out.println(groups[1][2]);
		
		
			
		}
	}
