package Fundamentals01;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = 5;
		int nsp = 0;
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
			nsp++;
			nst--;
		}

		s.close();
	}

}
