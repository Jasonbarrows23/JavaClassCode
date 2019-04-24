package com.class14;

public class groupQuestions4 {

	public static void main(String[] args) {
		//4.How to find out the part of the string from a string?
		//What is substring? Find number of words in string?

		String str2="New Syntax Questions";
        String[] array=str2.split("Syntax");
       
        int str3=str2.length();
        System.out.println("The length of the array is "+array.length);
        for(String substring: array) {
            System.out.println(substring);
        }
        System.out.println("-----------");
        for(int i=0;i<array.length; i++ ) {
            System.out.println(array[i]);
     }
        System.out.println("There are "+str3+ " words in this string");
}
}
