package Fundamentals01;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {

			// star work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// preparation
			System.out.println();
			
			if (row < n)
				nst++;
			else
				nst--;
			row++;
		}

		s.close();
	}

}
