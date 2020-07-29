package Challenges_Patterns;

import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n / 2 + 1;
		int nsp = -1;
		int rows = 1;

		while (rows <= n) {

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// star work
			int cst = 1;
			if (rows == 1 || rows == n)
				cst = 2;

			for (; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			// prepare
			System.out.println();
			if (rows <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			rows++;
		}

		s.close();
	}

}
