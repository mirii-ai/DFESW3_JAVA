package com.qa.main;

public class DfEExercise1 {
	 
	public static void main(String[] args) {
 
		boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
 
		int weight = 20; //assigns 20 to a weight int
		String name = "Billy Bob"; // creates a string and assigns "Billy Bob"
		Dog goodBoy = new Dog(name, weight); //object called goodBoy being created, name BillyBob, weight 20
		int x = weight - 10; // new int x being initialised, value 10
		if (x < 15) goodBoy.bark();
 
		while (x < 3) {
			goodBoy.play();
		}
 
		int[] numList = {1,2,3,4,5,6}; //Creating an array named numList and entering numbers
		System.out.println("How are you");
		System.out.println("My " + name + " is doing great"
				+ " how's yours");
		String num = "305"; 
		int z = Integer.parseInt(num);
 
 
 
	}
 
 
	}