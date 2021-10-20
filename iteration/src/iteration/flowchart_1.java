package iteration;

public class flowchart_1 {
	
	public static boolean flow1() {
		
		for (int A = 100; A < 200; A++) {
			System.out.println("A");
		}
		return true;
	}
	
	public static void flow2() {
		for (int A = 100; A<= 200; A++) {
			if (A%2 ==0) {
				System.out.println("-");
			}else {
				System.out.println("*");
			}
		}
	}
	
	public static void q3() {
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y <10; y++) {
				System.out.println(x +1 + ", " + (y+1));
			}
		}
	}
	
	public static void q5(int number) {
		for (int x = 0; x < number; x++) {
			for (int y = 0; y <number; y++) {
				System.out.println(x +1 + ", " + (y+1));
			}
		}
	}

}
