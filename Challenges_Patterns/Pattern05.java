package Challenges_Patterns;

import java.util.Scanner;

public class Pattern05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp1 = n - 1;
		int nsp2 = n - 2;
		int rows = 1;

		while (rows <= n) {

			// space work
			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print(" ");
			}

			// star work
			if (rows == 1 || rows == n)
				nst = n;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// space work
			for (int csp = 1; csp <= nsp2; csp++) {
				System.out.print(" ");
			}

			// star work
			if (rows == n || rows == 1) {

			} else {
				for (int cst = 1; cst <= nst; cst++) {
					System.out.print("*");
				}
			}

			// prepare
			System.out.println();
			nsp1--;
			rows++;
			nst = 1;
		}

		s.close();
	}
}
