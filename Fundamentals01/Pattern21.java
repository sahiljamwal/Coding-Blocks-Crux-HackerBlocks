package Fundamentals01;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = 1;
		int nsp = 2 * n - 3;
		int row = 1;
		while (row <= n) {

			// star pattern
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// space pattern
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// start pattern
			if (row != n) {
				for (int cst = 1; cst <= nst; cst++) {
					System.out.print("*");
				}
			} else {
				for (int cst = 1; cst <= nst - 1; cst++) {
					System.out.print("*");
				}
			}

			// preparation
			System.out.println();
			nsp -= 2;
			nst += 1;
			row++;
		}

		s.close();

	}

}
