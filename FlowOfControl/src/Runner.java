
public class Runner {
	//main method is what runs
	//don't write code in main, link to methods
	
		public static void main(String[] args) {
			
			//code runs from main, top to bottom
			//tell main method to run newMethod
			
//			newMethod();
			
			//most of the main method will be quite empty,
			//just calling on other methods that make the code work
			
//			helloEveryone();
			
//			System.out.println("3");
//			System.out.println("2");
//			System.out.println("1");
			
			firstOne.favPizzaTopping(); //this will run the method from the other file
			firstOne.favWord();
			firstOne.favNumber();
		}
		
	//new method
	// all methods should be public static void(but this will change)
		public static void newMethod() {
			//method body - what runs when we tell it to
			
			System.out.println("Hello everyone!");
			
			
		}
		public static void helloEveryone() {
			System.out.println("Hello! Nice to meet you!");
		}
}
