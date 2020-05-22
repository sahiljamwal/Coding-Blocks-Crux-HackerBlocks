package Challenges_Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n;
		int value = 1;
		int rows = 1;
		while (rows <= n) {

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				if (cst <= rows)
					System.out.print(value++);
				else
					System.out.print("*");
			}

			// prepare
			System.out.println();
			rows++;
			value = 1;
		}

		s.close();
	}

}
