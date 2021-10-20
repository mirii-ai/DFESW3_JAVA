package iteration;

public class coins {
//	Given a cost and an amount, work out the change given in specific coinage.
//	For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
//	1 £10 note
//	1 £5 note
//	2 20p's
//	1 2p
	
	public static void findChange(float num1, float num2) {
		float cost = num1;
		float given = num2;
		float change_print = given - cost;
		float change = given-cost;
		
		int countTen = 0;
		int countFive = 0;
		int countTwo = 0;
		int countOne = 0;
		int countFifty=0;
		int countTwenty = 0;
		int countTenp = 0;
		int countFivep = 0;
		int countTwop = 0;
		int countOnep = 0;
		
		while (change >=  10) {
			change -= 10;
			countTen ++;
		}
		while (change >=  5) {
			change -= 5;
			countFive ++;
		}
		while (change >=  2) {
			change -= 2;
			countTwo ++;
		}
		while (change >=  1) {
			change -= 1;
			countOne ++;
		}
		while (change >=  0.5) {
			change -= 0.5f;
			countFifty ++;
		}
		while (change >=  0.2) {
			change -= 0.2f;
			countTwenty ++;
		}
		while (change >=  0.1) {
			change -= 0.1f;
			countTenp ++;
		}
		while (change >=  0.05) {
			change -= 0.05f;
			countFivep ++;
		}
		while (change >=  0.02) {
			change -= 0.02f;
			countTwop ++;
		}
		while (change >=  0.01) {
			change -= 0.01f;
			countOnep ++;
		}
		
		
		System.out.println("=======");
		System.out.println("CHANGE : " + change_print);
		System.out.println("=======");
		System.out.println("£10 notes: " + countTen);
		System.out.println("£5 notes: " + countFive);
		System.out.println("£2 coins: " + countTwo);
		System.out.println("£1 coins: " + countOne);
		System.out.println("50p coins: " + countFifty);
		System.out.println("20p coins: " + countTwenty);
		System.out.println("10p coins: " + countTenp);
		System.out.println("5p coins: " + countFivep);
		System.out.println("2p coins: " + countTwop);
		System.out.println("1p coins: " + countOnep);
	}
}
