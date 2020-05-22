package Challenges_Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp1 = n - 1;
		int nsp2 = -1;
		int value;
		int rows = 1;

		while (rows <= n) {

			if (rows > n / 2 + 1)
				value = n - rows + 1;
			else
				value = rows;

			// space work
			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print("  ");
			}

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((value--)+" ");
			}

			// space work
			for (int csp = 1; csp <= nsp2; csp++) {
				System.out.print("  ");
			}

			// star work
			int cst = 1;
			if (rows == 1 || rows == n)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print((++value)+" ");
			}

			// prepare
			System.out.println();
			if (rows <= n / 2) {
				nsp1 -= 2;
				nsp2 += 2;
				nst++;
			} else {
				nsp1 += 2;
				nsp2 -= 2;
				nst--;
			}
			rows++;
		}

		s.close();
	}

}
