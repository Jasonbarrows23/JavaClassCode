package com.class16;

public class Dog {

	    String breed,color;
	    
	    public static void main(String[] args) {
	        
	    
	    Dog dog1=new Dog();
	    
	    dog1.breed="Husky";
	    dog1.color="white";
	    
	    
	    dog1.play();
	    dog1.jump();
	    dog1.run();
	    
	Dog dog2=new Dog();
	    
	    dog2.breed="Bulldog";
	    dog2.color="black";
	    
	    
	    dog2.play();
	    dog2.jump();
	    dog2.run();
	    
	Dog dog3=new Dog();
	    
	    dog3.breed="Labrador";
	    dog3.color="gray";

	    
	    dog3.play();
	    dog3.jump();
	    dog3.run();
	    
	    

	    
	    }
	    void play() {
	        System.out.println("Dog can play "+breed);
	    }
	    void jump() {
	        System.out.println("Dog can play "+breed);
	    }
	    void run() {
	        System.out.println("Dog can play "+breed);
	    }

}
