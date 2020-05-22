package Challenges_Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = 2 * n - 3;
		int value = 1;
		int rows = 1;

		while (rows <= n) {

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((value++) + "\t");
			}

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// star work
			int cst = 1;
			if (rows == n) {
				cst = 2;
				--value;
			}

			for (; cst <= nst; cst++) {
				System.out.print((--value) + "\t");
			}

			// prepare
			System.out.println();
			rows++;
			nst++;
			nsp -= 2;
		}

		s.close();
	}

}
