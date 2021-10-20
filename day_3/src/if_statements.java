
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
	
	// Task - Using Java IF Else create an if else stack that does the following:
	// - Prints out "Greater than" if a number is greater than 10
	// - Prints out "Equals" if a number is equal to 10
	// - Prints out "less than" if a number is less than 10
	
	public static String GreaterThan(int number) {
		if (number >10) {
			return "Greater than";
		}else if (number == 10) {
			return "Equals";
		}else {
			return "Less than";
		}
	}
		
}
