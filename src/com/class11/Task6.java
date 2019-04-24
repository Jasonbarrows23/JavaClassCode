package com.class11;

public class Task6 {

	public static void main(String[] args) {
		//create an array of cars: American, German, Korean, Italian.
		//Then retrieve all values from that array
		
		String[][] cars= {
				{"ford", "chevy", "jeep"},
				{"bmw", "mercedes","audi"},
				{"kia","Hyundai"},
				{"lambo","ferrari"}		
		};
		
		for (int i=0; i<cars.length; i++) {
		
			for( int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+ " ");
			}
			System.out.println();
		}
	}
	}
