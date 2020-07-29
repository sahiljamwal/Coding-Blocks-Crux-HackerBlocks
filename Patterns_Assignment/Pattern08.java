package Patterns_Assignment;

import java.util.Scanner;

public class Pattern08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp1 = 0;
		int nsp2 = n - 2;
		int nst = 1;

		int row = 1;
		while (row <= n) {

			// space
			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print(" ");
			}

			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// space
			for (int csp = 1; csp <= nsp2; csp++) {
				System.out.print(" ");
			}

			// star
			int cst = 1;
			if (row == n / 2 + 1)
				cst = 2;

			for (; cst <= nst; cst++) {
				System.out.print("*");
			}

			// preparation
			System.out.println();
			if (row <= n / 2) {
				nsp1++;
				nsp2 -= 2;
			} else {
				nsp1--;
				nsp2 += 2;
			}
			row++;

		}

		s.close();
	}

}
