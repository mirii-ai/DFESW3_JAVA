package iteration;
import java.util.Random;
public class money_review {

//	Task - Create a new class and method that do the following:
//
//		- Using a while loop start with a beginning total (300), subtract an amount of money from it
//		(45) until the total goes less than another value (87)
//
//		When the total goes below the set value, print out "You're spending too much money!"


	public static void moneyReview() {
		
		Random random_no = new Random();
		int total = 300;
		int count = 0;
		while (total > 87) {
			System.out.println("Iteration number: " + count);
			total -=  random_no.nextInt(100);
			count += 1;
						if (total < 87) {
				System.out.println("You're spending too much money!");
			}
		}
		
	}


}
