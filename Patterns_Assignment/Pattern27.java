package Patterns_Assignment;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int val = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
			val=1;

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// number work
			for (int cst = 1; cst <= nst; cst++) {
				
				System.out.print(val+"\t");
				if(cst <= nst/2) {
					val++;
				}else {
					val--;
				}
			}

			// preparation
			System.out.println();
			row++;
			nsp--;
			nst+=2;
		}

		s.close();
	}

}
