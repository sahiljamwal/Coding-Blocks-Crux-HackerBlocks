package Patterns_Assignment;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = n/2;
		int nsp = 1;
		while (row <= n) {

			// star work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			//space work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			
			//star work
			cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// preparation
			System.out.println();
			
			if (row <= n/2) {
				nsp+=2;
				nst--;
			}
			else {
				nsp-=2;
				nst++;
			}
			row++;
		}

		s.close();
		
	}

}
