package operators;

public class calculator {

	public static float divideMethod(float num1, float num2) {
		float result = num1 / num2; //int prints a whole number, not a decimal. Putting float and 'f' prints the decimal answer
		return result;
	}
	
	public static int addMethod(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static float subtractMethod(int num1, int num2) {
		int result = num1 - num2; //int prints a whole number, not a decimal. Putting float and 'f' prints the decimal answer
		return result;
	}
	
	public static int multiplyMethod(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public static int powerMethod(int num1, int num2) {
		int count = num2;
		int result = 1;
		while (count > 0) {
			result *= num1;
			count--;
		}
		return result;
	}
	
	public static int powerMethod2(int num1, int num2) {
		int result = (int) Math.pow(x, y);
		return result;
	}
	
	
}
