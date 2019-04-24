package com.class16;

public class Phone {
	
	String make, model;
	int camera;
	
	public static void main(String[] args) {
	
		
	//First Object
	Phone Phone1=new Phone();
	Phone1.make="Apple";
	Phone1.model="iPhone";
	Phone1.camera=2;
	
	Phone1.twoCameras();
	
	
	//Second Object
	Phone Phone2=new Phone();
	Phone2.make="Samsung";
	Phone2.model="Galaxy";
	Phone2.camera=3;
	
	Phone2.threeCameras();
	
	//Third Object
	Phone Phone3=new Phone();
	Phone3.make="Nokia";
	Phone3.model="pureView";
	Phone3.camera=1;
	
	Phone3.oneCamera();
	
	}
	void twoCameras() {
		System.out.println("I have two cameras on my "+model);
	}
	void threeCameras() {
		System.out.println("I have three cameras on my "+model);
	}
	void oneCamera() {
		System.out.println("I have one camera on my "+model);
	}
	

}
