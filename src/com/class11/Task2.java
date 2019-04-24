package com.class11;

public class Task2 {

	public static void main(String[] args) {
		//create an+ array of countries. While retrieving all values from an array print capital for each country
		
		String[] array= {"USA", "Pakistan", "Afganistan"};
		
		for (int i=0;i<array.length;i++);
		
		if(array.equals("USA")) {
			System.out.println("D.C");
			
		}else if (array.equals("Pakistan")) {
			System.out.println("Islamabad");
			
		}else if (array.equals("Afganistan")) {
			System.out.println("Kabul");
		}
		
		//

	
	
	String[] countries= {"USA", "Paksitan", "Afganistan"};

		for (String country:countries) {
			
			switch(country) {
			case "USA":
				System.out.println("D.C");
				break;
			case "Pakistan":
				System.out.println("Islamabad");
			    break;
			case "Afganistan":
				System.out.println("Kabul");
				break;
			}
		}
		}
		}