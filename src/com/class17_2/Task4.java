package com.class17_2;

public class Task4 {

	public static void main(String[] args) {
		/* Print the following pattern:
		 * *
         * **
         * ***
         * ****
         * *****
         * ****
         * ***
         * **
         * *
         */ 
		
		for(int i = 0;i<5;i++) {
            for(int j= 0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 5;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

	}

}
