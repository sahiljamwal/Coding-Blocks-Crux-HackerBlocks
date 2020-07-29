package Challenges_Patterns;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int rows = 1;
		int a = 0, b = 1;
		int c;
		while (rows <= n) {
			nst = rows;
			// star work
			for (int cst = 1; cst <= nst; cst++) {
				if (rows == 1) {
					System.out.print(a + "\t");
				} else if (rows == 2) {
					if (cst == 1)
						System.out.print(b + "\t");
					if (cst == 2) {
						c = a + b;
						a = b;
						b = c;
						System.out.print(c + "\t");
					}
				} else {
					c = a + b;
					a = b;
					b = c;

					System.out.print(c + "\t");
				}

			}

			// prepare
			System.out.println();
			rows++;

		}

		s.close();
	}


}
