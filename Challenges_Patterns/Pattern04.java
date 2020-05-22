package Challenges_Patterns;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int value;
		int rows = 1;
		while (rows <= n) {
			value = rows;

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == nst)
					System.out.print((value++) + "\t");
				else if (cst <= nst / 2)
					System.out.print((value++) + "\t");
				else
					System.out.print((value--) + "\t");

			}

			// prepare
			System.out.println();
			nst += 2;
			nsp--;
			rows++;
		}

		s.close();
	}

}
