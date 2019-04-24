package com.class16;

public class Computer {
	
	String os, brand;
	boolean mouse, keyboard;
	int screen,ram;
	
	
	public static void main(String[] args) {
	
	//1st Object
	Computer Comp1=new Computer();
	Comp1.mouse=true;
	Comp1.keyboard=true;
	Comp1.screen=2;
	Comp1.ram=8;
	Comp1.os="Windows";
	Comp1.brand="HP";
	
	Comp1.watchMovie();
	Comp1.doJavaCoding();
	Comp1.playMusic();
	
	//2nd object
	Computer Comp2=new Computer();
	Comp2.mouse=false;
	Comp2.keyboard=false;
	Comp2.screen=4;
	Comp2.ram=6;
	Comp2.os="Mac OS";
	Comp2.brand="Apple";
	
	Comp2.watchMovie();
	Comp2.doJavaCoding();
	Comp2.playMusic();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}
	
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
		
	}
}
