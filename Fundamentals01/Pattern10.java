package Fundamentals01;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 2 * n - 1;
		int nsp = 0;

		int row = 1;
		while (row <= n) {
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("");
			}

			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// prepare
			System.out.println();
			nst -= 2;
			nsp++;
			row++;
		}

		s.close();
	}

}
