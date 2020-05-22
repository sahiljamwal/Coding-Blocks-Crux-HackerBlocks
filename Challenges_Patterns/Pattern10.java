package Challenges_Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n;
		int nsh = -1;
		int rows = 1;
		int value = 1;

		while (rows <= n) {

			// value work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((value++) + " ");
			}

			// star work
			for (int csh = 1; csh <= nsh; csh++) {
				System.out.print("* ");
			}

			// prepare
			System.out.println();
			nsh += 2;
			nst--;
			rows++;
			value = 1;
		}

		s.close();

	}

}
