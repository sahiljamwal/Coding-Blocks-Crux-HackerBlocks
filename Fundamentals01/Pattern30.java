package Fundamentals01;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;

		while (row <= n) {
			int val = n;
			int nst = n;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((val--) + "\t");
			}

			// preparation
			System.out.println();
			row++;

		}

		s.close();
	}

}
