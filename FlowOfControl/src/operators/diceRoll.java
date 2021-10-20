package operators;
import java.util.Arrays;
import java.util.Random;


//Task - Create methods that return the following dice rolls
//
//3 sided dice
//4 sided dice
//6 sided
//8 sided
//10 sided
//
//methods that do the following calculations
//- sum of 4 six sided dice
//- sum of 2 10 sided dice and 2 3 sided dice
//- sum of 1 of each dice
//
//Stretch goal:
//- sum of 4 six sided dice ignoring the smallest value

public class diceRoll {
	
	
	public static int rollDice3() {
		int number = new Random().nextInt(3) +1;
		return number;
	}
	
	public static int rollDice4() {
		int number = new Random().nextInt(4) +1;
		return number;
	}
	
	public static int rollDice6() {
		int number = new Random().nextInt(6) +1;
		return number;
	}
	
	public static int rollDice8() {
		int number = new Random().nextInt(8) +1;
		return number;
	}
	
	public static int rollDice10() {
		int number = new Random().nextInt(10) +1;
		return number;
	}
	
	
	public static int sumOfFourSixDice(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}
	
	public static int sumOfTwoTenDiceAndTwoThreeDice() {
		int ten1 = rollDice10();
		int ten2 = rollDice10();
		
		int twothreedietotal = 0;
		for (int i = 0; i < 2; i++) {
			twothreedietotal += rollDice3();
        }
		
		return twothreedietotal + ten1 + ten2;
	}
	
	public static int sumOfOneEach() {
		return rollDice3() + rollDice4() + rollDice6() + rollDice8() + rollDice10();
	}
	
	public static int sumOfFourSixDieExSmallest() {
		int[] numbers = {rollDice6(), rollDice6(), rollDice6(), rollDice6()};
		
		Arrays.sort(numbers);
		System.out.println(numbers[1] + " " + numbers[2] + " " + numbers[3]);
		int total = numbers[1] + numbers[2] + numbers[3];
		
		return total;
		
		
	}
}
