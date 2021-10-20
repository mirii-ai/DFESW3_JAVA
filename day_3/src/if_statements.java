import java.util.Arrays;
import java.util.random.*;

public class if_statements {
//	boolean isKettleOn = true;
//	
//	isKettleOn = false;
//	
//	if (isKettleOn ==true) {
//		System.out.println("I'll take milk no sugar");
//	}else {
//		System.out.println("Pop the kettle on");
//	}
//	
//	boolean binsOut = true;
//	
//	if (binsOut) {
//		System.out.println("Bins are out!");
//	}else {
//		System.out.println("Bins were forgotten...");
////// ===================================================
//////===================================================
	
	// Task - Using Java IF Else create an if else stack that does the following:
	// - Prints out "Greater than" if a number is greater than 10
	// - Prints out "Equals" if a number is equal to 10
	// - Prints out "less than" if a number is less than 10
	
//	public static String GreaterThan(int number) {
//		if (number >10) {
//			return "Greater than";
//		}else if (number == 10) {
//			return "Equals";
//		}else {
//			return "Less than";
//		}
//	}
	
//////===================================================
//////===================================================
	
//	public static int ExtraTask(int parameter) {
//		if (parameter > 2000) {
//			
//		}else {
//			System.out.println(1);
//			if (parameter>100) {
//				System.out.println(3);
//				if (parameter > 600) {
//					System.out.println(5);
//				}else {
//					System.out.println(4);
//					if (parameter > 500) {
//						System.out.println(6);
//					}else {
//						System.out.println(7);
//					}
//				}
//			}else {
//				System.out.println(2);
//			}
//		}
//	}
	
//////===================================================
//////===================================================
	
	
//	public static void complexStatement() {
//		boolean bool = true;
//		String colour = "red";
//		
//		//if bool is true or colour is red
//		
//		if (bool == true || colour == "red"){
//			System.out.println("Bool is true OR colour is red.");
//			
//			if (bool == true && colour == "red") {
//				System.out.println("Bool is true AND colour is red"));
//			}else if (bool == true) {
//				System.out.println("Bool is true, colour is not red");
//			}else if (colour == "red") {
//				System.out.println("The colour is red.");
//			}
//		}
//	}
	
	
//////===================================================
//////===================================================
	
	public static int play(int num1, int num2) {
		int[] list = {num1, num2};
		Arrays.sort(list);
		if (num1<=21 && num2<=21) {
			return (list[1]);
		}else{
			if (num1 < 21 || num2 <21) {
				if (num1<21) {
					return (num1);
				}else {
					return (num2);
				}
			}
			return (0);
		}
		
	}
	
	
//////===================================================
//////===================================================
	
//	Given 3 integer values, return their sum. 
//	If one value is the same as another value, 
//	they do not count towards the sum. 
//	In other words, only return the sum of unique numbers given.
//
//			 Input(1, 2, 3) -> 6
//			 Input(3, 3, 3) -> 0
//			 Input(1, 1, 2) -> 2
	
	public static int sumOfThree(int num1, int num2, int num3) {
		int total = 0;
		
		if (num1 != num2 && num2 != num3 && num1 != num3) {
			total = num1 + num2 + num3;
		}else {
			if(num1 == num2 && num2 == num3) {
				total = 0;
			}else if (num2 == num3) {
				total = num1 + num2;
			}else if (num1 == num3) {
				total = num2 + num3;
			}else if (num1 == num2){
				total = num3 + num1;
			}else {
				total = 0;
			}
		}		
		return total;
	}
	
//////===================================================
//////===================================================
	
//	Create a method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//	Return 'FizzBuzz' for numbers which are multiples of both three and five.
//	Return the input number for numbers that are neither.
	
	public static String fizzBuzz(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}else if (number % 3 == 0 && number % 5 != 0) {
			return "Fizz";
		}else if (number % 5 == 0 && number % 3 != 0) {
			return "Buzz";
		}else {
			String return_value = String.valueOf(number);
			return(return_value);
		}
	}
	
//	Create the tax class, it contains 2 methods.
//
//	Method 1 - which takes a salary and works out the percentage by 
//	which the salary will be taxed.
//
//	Method 2 - which works out the exact amount that the user will be 
//	taxed using a similar process 
//	to that in the first method. That amount should be returned and output
//	to the console.
//
//	These 2 methods should be able to work independently, 
//	so it is fine in this case if some of the code is repeated.*
//
//	The salaries are taxed as below:
//
//	0 - 14,999 : 0% tax
//	15,000 - 19,999 : 10% tax
//	20,000 - 29,999 : 15% tax
//	30,000 - 44,999 : 20% tax
//	45,000+ : 25% tax
//	Finally combine the 2 methods so that the second method 
//	utilizes the first method to return the correct result.
	
	public static double tax_calc(double salary) {
		double tax = 0;
		if (salary <= 14999) {
			return salary;
		}else if (salary <=19999) {
			tax = salary * 0.1d;
			return tax;
		}else if (salary <=29999) {
			tax = salary * 0.15d;
			return tax;
		}else if (salary <=44999) {
			tax = salary * 0.2d;
			return tax;
		}else {
			tax = salary * 0.25d;
			return tax;
		}
	}
	
	public static double tax_final(double salary) {
		double tax = tax_calc(salary);
		return tax;
	}
}
