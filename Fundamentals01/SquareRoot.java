package Fundamentals01;

import java.util.Scanner;

//to print sqrt of number without using libraray function

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();

		printSquareRoot(n, p);
		s.close();
	}

	private static void printSquareRoot(int n, int p) {

		float ans = 0;// stores the final answer
		float inc = 1;
		// loop will run (p+1) times p time for precision and 1 extra time for integer
		// part
		int times = 0;

		while (times <= p) {
			while (ans * ans <= n) {
				ans = ans + inc;
			}
			/*
			 * loop terminates on terminating condition but answer will be one value before
			 * termination so
			 */
			ans = ans - inc;
			inc /= 10;
			times++;

		}
		System.out.println("Square root of " + n + " is " + ans);
	}

}
