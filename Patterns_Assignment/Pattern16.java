package Patterns_Assignment;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n;
		int nsp = n-1;

		int row = 1;
		while (row <= 2 * n - 1) {
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			// prepare
			System.out.println();
			if (row < n) {
				nst--;
				nsp--;
			} else {
				nsp++;
				nst++;
			}
			row++;
		}

		s.close();
	}

}
