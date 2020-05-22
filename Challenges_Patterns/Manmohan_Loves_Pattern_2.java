package Challenges_Patterns;

import java.util.Scanner;

public class Manmohan_Loves_Pattern_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int rows = 1;
		while (rows <= n) {
			nst = rows;
			// star work
			for (int cst = 1; cst <= nst; cst++) {
				if (rows == 1)
					System.out.print("1");
				else {
					if (cst == 1 || cst == nst)
						System.out.print(rows-1);
					else
						System.out.print("0");
				}
			}

			// prepare
			System.out.println();
			rows++;
		}

		s.close();
	}

}
