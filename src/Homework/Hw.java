package Homework;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		int score;
		String eligibility;
		boolean loan=true;
		Scanner abc=new Scanner(System.in);
		  System.out.println("Do you need a loan?");
		  loan=abc.nextBoolean();
		    System.out.println("What is your credit score?");
		    score=abc.nextInt();
		    
		  if (score<600){
		    eligibility=" Not eligible";
		  }else if(score>600 && score<=700) {
		    eligibility="Maybe eligible";
		  }else if(score>701 && score<=800) {
		    eligibility="Eligible";
		  }else if(score>800) {
		    eligibility="Definitely eligible";
		  }else {
		    eligibility="Unknown";
		  }
		    System.out.println("The eligibility is"+ eligibility);
		  }
	}

