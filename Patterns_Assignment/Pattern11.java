package Patterns_Assignment;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = n - 1;

		int row = 1;
		while (row <= n) {
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// star
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0)
					System.out.print("\t");
				else
					System.out.print("*\t");
			}

			// prepare
			System.out.println();
			nst += 2;
			nsp--;
			row++;
		}

		s.close();
	}

}
