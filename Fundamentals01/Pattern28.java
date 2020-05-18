package Fundamentals01;

import java.util.Scanner;

public class Pattern28 {

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
				else if (cst <= nst / 2 + 1)
					val++;
				else
					val--;
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
