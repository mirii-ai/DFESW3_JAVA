package MethodReturns;

public class Runner {
	public static void main(String[] args) {
		
		System.out.println(returningThings.returnChar());
		System.out.println(returningThings.returnFloat());
		System.out.println(returningThings.returnBoolean());
		System.out.println(returningThings.returnDouble());
		System.out.println(returningThings.returnString());
		
		returnObject snek = new returnObject(12, "Python", "Green", 3.5f);
		
		System.out.println(snek.toString());
		
	}
}
