package Fundamentals01;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = n;
		int nsp = 0;
		int row = 1;
		while (row <= n) {

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// star work
			for (int csp = 1; csp <= nst; csp++) {
				System.out.print("*");
			}

			// presentation
			System.out.println();
			row++;
			nsp += 2;
			nst--;

		}

		s.close();
	}

}
