package Patterns_Assignment;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int val = n;
		int row = 1;
		while (row <= n) {

			val = n - row + 1;
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// star
			for (int cst = 1; cst <= nst; cst++) {

				if (cst == nst / 2 + 1 || nst == 1)
					System.out.print("0\t");
				else if (cst > nst / 2)
					System.out.print((--val) + "\t");
				else
					System.out.print((val++) + "\t");
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
