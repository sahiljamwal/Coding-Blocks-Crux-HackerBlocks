package Daily_Code_Byte;

import java.util.Scanner;

public class Pattern_Hour_Glass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp = 0;
		int nst = 2 * n + 1;
		int value = n;
		int on=n;
		int rows = 1;
		while (rows <= 2 * n + 1) {

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// start work
			for (int cst = 1; cst <= nst; cst++) {
				
				 if (cst <= nst / 2) {
					System.out.print((value--) + " ");
				} else {
					System.out.print((value++) + " ");
				}
				
			}

			// preparation
			System.out.println();
			if (rows <= (2 * n + 1) / 2) {
				nst -= 2;
				nsp++;
				value=--on;
			} else {
				nst += 2;
				nsp--;
				value=++on;
			}
			rows++;

		}
		s.close();
	}

}
