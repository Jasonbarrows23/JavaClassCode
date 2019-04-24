package com.class5;

import java.util.Scanner;

public class PracticeLogical {

	public static void main(String[] args) {
		
		Scanner myScanner;
        int Height;
        
        myScanner=new Scanner(System.in);
        System.out.println("Please enter height in inches ");
        Height=myScanner.nextInt();
        
        if (Height<5) {
        	System.out.println("person is short");
        }else if (Height>5 && Height <=6) {
        	System.out.println("person is medium");
        }else if (Height>6) {
        	System.out.println("person is tall");
        }

	}

}
