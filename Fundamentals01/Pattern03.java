package Fundamentals01;

import java.util.Scanner;

public class Pattern03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = n;
		while (row <= n) {

			// work
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// prepare
			System.out.println();
			nst--;
			row++;

		}

		s.close();
	}

}
