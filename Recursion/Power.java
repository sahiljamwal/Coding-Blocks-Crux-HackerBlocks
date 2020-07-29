package Recursion;

import java.util.Scanner;

//to print x^n recursively
public class Power {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();

		System.out.println(power(n, p));
		System.out.println(power(n, p, 1));

		s.close();
	}

	// non tail recursive fn()
	private static long power(int n, int p) {
		if (p == 0)
			return 1;
		return n * power(n, p - 1);
	}

	// tail optimised recursive fn()
	private static long power(int n, int p, int ans) {
		if (p == 0)
			return ans;
		return power(n, p - 1, n * ans);
	}

}
