package Recursion;

import java.util.Scanner;

//to print factorial of number recursively
public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(factorial(n));
		System.out.println(factorialShort(n));
		System.out.println(factorialOptimised(n, 1));

		s.close();

	}

	// not tail optimized recursive fn() as function call is not pure
	private static int factorial(int n) {
		// base case
		if (n == 1)
			return 1;

		// recursion work
		int fact = factorial(n - 1);

		// my work
		int fn = n * fact;

		return fn;
	}

	// shorthand recursive fn() not tail optimised
	private static int factorialShort(int n) {
		return ((n == 1) ? (1) : (n * factorialShort(n - 1)));
	}

	// tail optimized recursive function
	private static int factorialOptimised(int n, int fact) {
		if (n == 1)
			return fact;
		return factorialOptimised(n - 1, fact * n);
	}
}
