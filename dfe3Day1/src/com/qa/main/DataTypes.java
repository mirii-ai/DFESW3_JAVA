package com.qa.main;

public class DataTypes {
	public static void main(String[] args) {
	
		//primitives
		//boolean, char (only two non-numerical)
		//byte, short, int, long, float, double
		
		//BOOLEAN - yes/no, 1/0, true/false
		
		boolean isEveryoneHappy = true;
		
		//CHAR
		
		char letterA = 'A';
		char otherLetter = 300; //char works with unicode, having a number here will return the UNICODE letter/character, not the number you type in
		
	//	system.out.println(otherLetter);
		
		//BYTE - 8 bit, goes from -128 to 127 00000001 00000010 00000011 00000100 00000101 00000110 00000111
		
		byte alittleBite = 30;
		
		//SHORT 16-bit
		short shorty = 500;
		
		//INT 32-bit
		int integer = 500000; 
		
		//LONG 64-bit
		long aNumber = 40000000000l; //java gets confused with long numbers- for numbers like this you need to add an 'l' at the end
		//the compiler needs this to understand exactly what sort of datatype it is
		
		//FLOAT - also 32-bit
		
		float pi = 3.14159f; //similar vein, you need to put an f for long floats
		
		//DOUBLE - 64-bit version of a float
		
		double doubley = 2.1155251419d;
		
		//be mindful of data types when adding and doing maths in Java.
		//there is a hierarchy- anything above the data type cannot be converted into a type below itself
		//ie. anything below int would be accepted in a calculation, but longs and floats cannot
		
		//REFERENCE
		
		String stringy = "I am a string.";
		
		System.out.println(integer);
	}

}
