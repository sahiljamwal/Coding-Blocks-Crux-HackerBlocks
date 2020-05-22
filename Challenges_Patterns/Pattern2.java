package Challenges_Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int rows = 1;
		int index=0;
		int[] fibonacci = new int[(n * (n + 1)) / 2];
		generateFibonacci(fibonacci);
		while (rows <= n) {
			nst = rows;
			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(fibonacci[index++]+"\t");
			}

			// prepare
			System.out.println();
			rows++;

		}

		s.close();
	}

	private static void generateFibonacci(int[] fibonacci) {
		int a = 0;
		int b = 1;
		int index=0;
		fibonacci[index++]=a;
		fibonacci[index++]=b;
		int n = fibonacci.length;
		int c;
		for (int i = 3; i <= n; i++) {
			c=a+b;
			fibonacci[index++]=c;
			a=b;
			b=c;
		}
	}

}
