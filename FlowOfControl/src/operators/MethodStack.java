package operators;

import java.util.Random;

public class MethodStack {
	
	//this method will return a number to main
	
	public static int firstLayer() {
		System.out.println("First layer called");
		int result = secondLayer();
		
		result = result + secondLayer();
		System.out.println("First layer finished");
		return result;
	}
	
	public static int secondLayer() {
		// new Random().nextInt() will return a random number for firstLayer() to use
		int result = new Random().nextInt(8);
		System.out.println("Second layer called");
		return result;
	}
	
// new Random().nextInt() will return a random number from 0 to max (-1)
//	import java.util.Random;
//	`int result = new Random().nextInt(8);`
// Random rand = new Random(Limit);

}
