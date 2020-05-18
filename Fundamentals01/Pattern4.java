package Fundamentals01;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {

			// space work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// star work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prepare
			System.out.println();
			row++;
			nsp--;
			nst++;
		}

		s.close();
	}

}
