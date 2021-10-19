package com.qa.main;
import java.util.Scanner;  // Import the Scanner class

public class Turtle {
	
	int age = 55;
	boolean isWiseandAncient = true;
	String shellColour = "Green";
	String favFood;
	float length = 0.7f;
	int offSpring = 12;
	int speed;
	boolean goodAttitude = false;
	
	public boolean turtAge() {
		if (age > 60){
			isWiseandAncient = true;
		}else {
			isWiseandAncient = false;
		}
		return isWiseandAncient;
	}
	
	
	public String turtColour() {
		Scanner turtle2 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter turtle colour:");

	    String col = turtle2.nextLine();  // Read user input
	    System.out.println("Colour is:  " + col); 
		shellColour = col;
		return shellColour;
	}
	
	
	public String turtFood() {
		if (shellColour == "Green"){
			favFood = "Lettuce";
		}else {
			favFood = "Carrots";
		}
		return favFood;
	}
	
	public void speeding(boolean goodAttitude) {
		if (speed > 35 || goodAttitude == false) {
			System.out.println("Why u coming fast?!");
		}else {
			System.out.println("Speed up!");
		}
	}

	public void flipper() {
		System.out.println("Flip flip");
	}
	
	public Turtle() {
		
	}
	
	public Turtle(int age, String shellColour, String favFood, float length, int speed, boolean goodAttitude) {
		this.age = age;
		this.shellColour = shellColour;
		this.favFood = favFood;
		this.length = length;
		this.speed = speed;
		this.goodAttitude = goodAttitude;
	}


	@Override
	public String toString() {
		return "Turtle [age=" + age + ", isWiseandAncient=" + isWiseandAncient + ", shellColour=" + shellColour
				+ ", favFood=" + favFood + ", length=" + length + ", offSpring=" + offSpring + ", speed=" + speed
				+ ", goodAttitude=" + goodAttitude + "]";
	}
	

}
