package Fundamentals01;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp1 = n / 2;
		int nsp2 = -1;
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
			if (row == 1 || row == n)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}

			// pattern
			System.out.println();
			if (row <= n / 2) {
				nsp1--;
				nsp2 += 2;
			} else {
				nsp1++;
				nsp2 -= 2;
			}
			row++;

		}
		s.close();
	}

}
