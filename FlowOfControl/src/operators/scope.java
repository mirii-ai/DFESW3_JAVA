package operators;

public class scope {
	
	public static String helloWorld() {
		System.out.println(total);
		return "Hello";
	}
	public static String helloDemo() {
		return helloWorld();
	}
	public static int total = 5;
	
	//downsides - accidentally messing up every other method by accessing in use variables
	//positives - saves time from having to declare the same variable everywhere
	
	//local scope variables
	//variables declared inside a method and can't be used elsewhere
	
	public static void bankaccount() {
		//local
		int bankNumber = 123456789;
	}
	
	public static void biH4ac3r() {
//		System.out.println(bankNumber); //not possible!

	
	}

}
