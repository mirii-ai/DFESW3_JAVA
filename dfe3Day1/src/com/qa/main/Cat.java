package com.qa.main;

public class Cat {
	
	//First we need to set its attributes
	
	int age;
	boolean isHairShort = true; //by default all have short hair
	String hairColour = "Ginger";
	String favouriteFood;
	
	//Methods- CAN DOs
	
	public void scratch(){
		System.out.println("I scratched.");
	}
	
	public int catDoesMath(int a, int b) { //declaring return data type
		return a + b;
	}
	
	public String catEats() {
		if (age > 10) {
			favouriteFood = "Tuna";
		} else {
			favouriteFood = "Chicken";
		}
		return favouriteFood;
	}
	public Cat() {
		//it has nothing in it deliberately
	}
	
	public Cat(int age, boolean isHairShort, String hairColour, String favouriteFood) {
		//create constructor. A way in which we are able to formulate the variables that are required to be set as the object is being created.
		this.age = age;
		this.isHairShort = isHairShort;
		this.hairColour = hairColour;
		this.favouriteFood = favouriteFood;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", isHairShort=" + isHairShort + ", hairColour=" + hairColour + ", favouriteFood="
				+ favouriteFood + "]";
	}
	
}
