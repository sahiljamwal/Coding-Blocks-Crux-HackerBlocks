package Challenges_Patterns;

import java.util.Scanner;

public class Pattern08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = 2 * n - 1;
		int rows = 1;
		int value = n;
		int original = n;
		n = 2 * n + 1;

		while (rows <= n) {

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((value--) + " ");
			}

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// star work
			int cst = 1;
			if (rows == n / 2 + 1) {
				cst = 2;
				++value;
			}

			for (; cst <= nst; cst++) {
				System.out.print((++value) + " ");
			}

			// prepare
			System.out.println();
			if (rows <= n / 2) {
				nst++;
				nsp -= 2;
			} else {
				nst--;
				nsp += 2;
			}
			value = original;
			rows++;
		}

		s.close();
	}

}
