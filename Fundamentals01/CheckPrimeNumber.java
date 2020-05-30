package Fundamentals01;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(n + " is " + checkPrime1(n));
		System.out.println(n + " is " + checkPrime2(n));
		System.out.println(n + " is " + checkPrime3(n));
		System.out.println(n + " is " + checkPrime4(n));

		s.close();
	}

	// Approach 1 - O(n) check from 2 to n-1 elements
	private static String checkPrime1(int n) {
		if (n == 1)
			return "NOT PRIME";

		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0)
				return "NOT PRIME";
		}
		return "PRIME";
	}

	// Approach 2 - O(n/2) check from 2 to n/2 elements
	private static String checkPrime2(int n) {
		if (n == 1)
			return "NOT PRIME";

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return "NOT PRIME";
		}
		return "PRIME";
	}

	// Approach 3 - O(sqrt(n)) check from 2 to sqrt(n) elements
	private static String checkPrime3(int n) {
		if (n == 1)
			return "NOT PRIME";

		for (int i = 2; i * i <= (n); i++) {
			if (n % i == 0)
				return "NOT PRIME";
		}
		return "PRIME";
	}

	// Approach 4 - O(sqrt(n)/2) optimization of approach 3
	private static String checkPrime4(int n) {
		if (n == 1)
			return "NOT PRIME";
		else if (n == 2)
			return "PRIME";
		else if (n % 2 == 0)
			return "NOT PRIME";
		else {
			for (int i = 3; i * i <= (n); i += 2) {
				if (n % i == 0)
					return "NOT PRIME";
			}
			return "PRIME";
		}

	}

}
