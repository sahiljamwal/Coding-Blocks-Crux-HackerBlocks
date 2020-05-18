package Fundamentals01;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("*\t");
		}
		System.out.println();
		int nsp = n - 2;
		for (int row = 2; row <= n - 1; row++) {

			System.out.print("*\t");
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			
			System.out.println();

		}
		for (int i = 1; i <= n; i++) {
			System.out.print("*\t");
		}
		System.out.println();

		s.close();
	}

}
