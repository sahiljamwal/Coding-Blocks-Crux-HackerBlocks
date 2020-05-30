package Patterns_Assignment;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n;
		int nsp = -1;

		int row = 1;
		while (row <= n) {

			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// star
			int cst = 1;
			if (row == 1)
				cst = 2;

			for (; cst <= nst; cst++) {
				System.out.print("*");
			}

			// preparation
			System.out.println();
			nsp += 2;
			nst--;
			row++;

		}

		s.close();
	}

}
