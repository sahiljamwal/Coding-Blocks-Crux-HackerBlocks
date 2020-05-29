package Challenges_Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class Broken_Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		factorial(n);
		s.close();
	}

	private static void factorial(int n) {
		BigInteger fact = new BigInteger("1");

		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}

		System.out.println(fact);
	}

}
