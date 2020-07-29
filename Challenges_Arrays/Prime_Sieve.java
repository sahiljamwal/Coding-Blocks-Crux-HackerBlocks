package Challenges_Arrays;

import java.util.Scanner;

public class Prime_Sieve {

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

		int prime[] = new int[b + 1];

		for (int i = 0; i < prime.length; i++) {
			prime[i] = 1;
		}

		prime[0] = 0;
		prime[1] = 0;

		for (int i = 4; i <= b; i += 2) {
			prime[i] = 0;
		}

		for (int i = 3; i <= b; i += 2) {
			if (prime[i] == 1) {
				for (int j = Math.abs(i * i); j <= b; j += 2 * i) {
					prime[j] = 0;
				}
			}
		}

		for (int i = a; i <= b; i++) {
			if(prime[i] == 1) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();

		return count;

	}

}
