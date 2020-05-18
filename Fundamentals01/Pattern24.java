package Fundamentals01;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int val = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// number work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
			}

			// preparation
			System.out.println();
			row++;
			nsp--;
			nst+=2;
			val++;
		}

		s.close();
	}

}
