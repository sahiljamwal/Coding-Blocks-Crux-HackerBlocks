package Patterns_Assignment;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int val;
		int row = 1;
		while (row <= n) {

			val = row;
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// star
			for (int cst = 1; cst <= nst; cst++) {

				if (cst == 1 || cst == nst)
					val = row;
				else
					val=0;
				System.out.print((val) + "\t");
			}

			// preparation
			System.out.println();
			nsp--;
			nst += 2;
			row++;

		}

		s.close();
	}

}
