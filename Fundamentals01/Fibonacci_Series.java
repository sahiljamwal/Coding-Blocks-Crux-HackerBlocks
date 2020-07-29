package Fundamentals01;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printFibonacciSequence(n);
		s.close();
	}

	private static void printFibonacciSequence(int n) {

		int a = 0;
		int b = 1;
		int c = a + b;
		if (n == 0)
			return;
		else if (n == 1)
			System.out.print("0");
		else if (n == 2)
			System.out.print("0,1");
		else {
			System.out.print("0,1,");
			int counter = 3;// tells for how many numbers have been printed
			while (counter <= n) {
				c = a + b;
				System.out.print(c + ",");
				a = b;
				b = c;
				counter++;
			}
		}

	}

}
