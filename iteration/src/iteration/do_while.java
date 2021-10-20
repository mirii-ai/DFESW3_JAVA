package iteration;

import java.util.Random;

public class do_while {

	
	public static void basicExample() {
		boolean testBool = true;
		
		System.out.println("Before loop");
		
		while(!testBool) {
			System.out.println("Will it ever print?");
		}
		
		System.out.println("After the loop");
		
		do {
			System.out.println("Printed from the do while loop");
		}while(!testBool);
		
		//Do while will always run once before checking the code
		//Do first with no condition, and a method body
		//followed by while, which contains the condition
	}
	
	
//	Task - Make a new method, using the code from the previous loop
//	converting it to a do while loop
//	- attempt to start with a low total than the minimum value across both loops
	
	public static void moneyReview() {
		
		Random random_no = new Random();
		int total = 200;
		int count = 0;
		do{
			System.out.println("Iteration number: " + count);
			total -=  random_no.nextInt(60);
			count += 1;
			System.out.println(total);
		}while (total > 50);	
		System.out.println("You're spending too much money!");
	}
}
