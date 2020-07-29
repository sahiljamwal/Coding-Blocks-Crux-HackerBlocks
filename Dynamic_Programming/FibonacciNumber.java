package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

// To find nth fibonacci number
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int memo[] = new int[n + 1];
		Arrays.fill(memo, -1);
		System.out.println(getFibonacciRecursive(n));
		System.out.println(getFibonacciMemoization(n, memo));
		System.out.println(getFibonacciTabulation(n));
		System.out.println(getFibonacciTabulationSpaceEfficient(n));

		s.close();
	}

	// Tabulation Approach Time Complexity O(n) and Space Complexity O(n)
	private static int getFibonacciTabulation(int n) {
		// what size of array to take
		int helper[] = new int[n + 1];
		// base case fill them in array
		helper[0] = 0;
		helper[1] = 1;
		// filling of array --decide direction
		for (int i = 2; i <= n; i++) {
			helper[i] = helper[i - 1] + helper[i - 2];
		}
		// what to return
		return helper[n];
	}

	// Memoization Approach Time Complexity O(n) and Space Complexity O(n)
	private static int getFibonacciMemoization(int n, int[] memo) {
		if (memo[n] == -1) {
			int res;
			if (n == 0 || n == 1) {
				res = n;
			} else {
				res = getFibonacciMemoization(n - 1, memo) + getFibonacciMemoization(n - 2, memo);
			}
			memo[n] = res; // --store result
		}
		return memo[n]; // --reuse already computed result
	}

	// Recursive approach Time Complexity O(2^n)
	private static int getFibonacciRecursive(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
	}

	// Tabulation Approach Time Complexity O(n) and Space Complexity O(1)
	public static int getFibonacciTabulationSpaceEfficient(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;

		for (int slide = 1; slide <= n - 1; slide++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];
	}

}
