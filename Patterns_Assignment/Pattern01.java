package Patterns_Assignment;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int row = 1; row <= n; row++) {

			// work
			for (int columns = 1; columns <= n; columns++) {
				System.out.print("* ");
			}
			// preparation
			System.out.println();
		}
		s.close();
	}

}
