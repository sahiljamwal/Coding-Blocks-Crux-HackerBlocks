package Patterns_Assignment;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			// star work
			for (int cst = 1; cst <= nst; cst++) {
				if(cst%2 == 0)
					System.out.print("*");
				else
					System.out.print(val);
			}

			// preparation
			System.out.println();
			if (row < n) {
				nst += 2;
				val++;
			} else {
				nst -= 2;
				val--;
			}

			row++;

		}

		s.close();

	}

}
