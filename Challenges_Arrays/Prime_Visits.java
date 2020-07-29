package Challenges_Arrays;

import java.util.Scanner;

public class Prime_Visits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int p = 0; p < t; p++) {
			int a = s.nextInt();
			int b = s.nextInt();

			System.out.println(primeVisits(a, b));

		}
		s.close();
	}

	private static int primeVisits(int a, int b) {
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (checkPrime(i)) {
				count++;
			}

		}
		return count;
	}

	private static boolean checkPrime(int n) {

		if (n == 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
