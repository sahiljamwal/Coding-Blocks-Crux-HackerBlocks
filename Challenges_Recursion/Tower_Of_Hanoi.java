package Challenges_Recursion;

import java.util.Scanner;

//solving the tower of Hanoi problem using recursion
public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		toh(n, "A", "B", "C");

		s.close();
	}

	private static void toh(int n, String source, String destination, String helper) {
		// base case
		if (n == 0)
			return;

		toh(n - 1, source, helper, destination);
		System.out.println("Moving ring " + n + " from " + source + " to " + destination);
		toh(n - 1, helper, destination, source);
	}

}
