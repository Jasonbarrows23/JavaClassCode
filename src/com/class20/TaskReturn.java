package com.class20;

public class TaskReturn {

	public static void main(String[] args) {
		//Create a method that will take a string and return array of words from that string.
		//Method should be available only within same class.
		
		TaskReturn obj = new TaskReturn();
		String[] array = obj.getWordsFromString("Have a goodnight students");
		
		for (int i=0; i<array.length; i++);
		Object i;
		System.out.println(array);
	}
		
	private String[] getWordsFromString(String str) {
		
		String[] words=str.split(" ");
		return words;
	}

	}

