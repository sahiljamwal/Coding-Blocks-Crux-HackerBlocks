package Recursion;

import java.util.Scanner;

public class Recursion_Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		PrintIncreasing(n);
		System.out.println("*******************");
		printDecreasing(n);
		System.out.println("*******************");
		printIncreasingDecreasing(n);
		System.out.println("*******************");
		printIncreasingDecreasingSkip(n);

		s.close();
	}

	private static void printIncreasingDecreasing(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printIncreasingDecreasing(n - 1);
		System.out.println(n);
	}

	// recursion do works only before fn() entering Stack
	private static void printDecreasing(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printDecreasing(n - 1);
	}

	// recursion do works only after fn() removes from Stack
	private static void PrintIncreasing(int n) {
		if (n == 0)
			return;
		PrintIncreasing(n - 1);
		System.out.println(n);
	}
	
	private static void printIncreasingDecreasingSkip(int n) {
		if(n == 0)
			return;
		if(n%2 != 0)
			System.out.println(n);
		printIncreasingDecreasingSkip(n-1);
		if(n%2 == 0)
			System.out.println(n);
	}

}
