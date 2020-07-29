package Patterns_Assignment;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n / 2;
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

			// Preparation
			System.out.println();
			if (row <= n / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}
			row++;

		}

		s.close();
	}

}
