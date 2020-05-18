package Fundamentals01;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(n + " is " + checkPrime(n));
		s.close();
	}

	private static String checkPrime(int n) {
		if (n == 1)
			return "NOT PRIME";

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return "NOT PRIME";
		}
		return "PRIME";
	}

}
