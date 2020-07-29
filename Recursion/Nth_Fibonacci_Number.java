package Recursion;

import java.util.Scanner;

//to get the Nth fibonacci number using recursion
public class Nth_Fibonacci_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(getFibonacci(n));

		s.close();
	}

	private static long getFibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

}
