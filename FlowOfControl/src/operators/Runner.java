package operators;

public class Runner {
	public static void main(String[] args) {
		
//		System.out.println(operators.addMethod());
//		System.out.println(operators.divideMethod());
//		
//		System.out.println(operators.addNums(17, 3));
//		
//		System.out.println(calculator.addMethod(5, 15));
//		System.out.println(calculator.multiplyMethod(3, 7));
//		System.out.println(calculator.divideMethod(30, 4));
//		System.out.println(calculator.subtractMethod(22, 7));
//		
//		System.out.println(calculator.powerMethod(4, 7));
		
//		System.out.println(MethodStack.firstLayer());
		
		// DICE EXERCISE
		
		System.out.println(diceRoll.rollDice3());
		System.out.println(diceRoll.rollDice4());
		System.out.println(diceRoll.rollDice6());
		System.out.println(diceRoll.rollDice8());
		System.out.println(diceRoll.rollDice10());
		
		
		System.out.println(diceRoll.sumOfFourSixDice(diceRoll.rollDice6(),diceRoll.rollDice6(),diceRoll.rollDice6(),diceRoll.rollDice6()));
		System.out.println(diceRoll.sumOfTwoTenDiceAndTwoThreeDice());
		System.out.println(diceRoll.sumOfOneEach());
		
		System.out.println("Final extra: " + diceRoll.sumOfFourSixDieExSmallest());
		
		System.out.println(scope.helloDemo());
		
		
	}
}
