package Patterns_Assignment;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;

		while (row <= n) {
			int val = n;
			int nst = n;
			for (int cst = 1; cst <= nst; cst++) {
				if(cst == n-row+1)
					System.out.print("*\t");
				else
					System.out.print((val) + "\t");
				val--;
			}

			// preparation
			System.out.println();
			row++;

		}

		s.close();
	}

}
