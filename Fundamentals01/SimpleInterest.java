package Fundamentals01;

public class SimpleInterest {

	public static void main(String[] args) {
		int principle=1000;
		int rate = 5;
		int time = 2;
		
		int si = (principle*rate*time)/100;
		
		System.out.println("Simple Interest is "+si);
	}

}
