package Challenges_Arrays;

import java.util.Scanner;

public class Chewbacca_And_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();

		generateMin(n);
		s.close();
	}

	private static void generateMin(long n) {
		int count = (int) Math.log10(n) + 1;
		long[] num = new long[count];

		for (int i = num.length - 1; i >= 0; i--) {
			num[i] = n % 10;
			n /= 10;
		}

		if (num[0] != 9) {
			if (9 - num[0] < num[0])
				num[0] = 9 - num[0];
		}

		for (int i = 1; i < num.length; i++) {
			long digit = num[i];
			if (9 - digit < digit) {
				num[i] = 9 - digit;
			}
		}

		for (long digit : num)
			System.out.print(digit);

	}

}
