package Challenges_Fundamentals;

import java.util.Scanner;

public class Delhi_Odd_Even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int p = 0; p < t; p++) {
			int num = s.nextInt();
			int count = (int) (Math.log10(num) + 1);
			int sum_odd = 0, sum_even = 0;
			for (int i = 1; i <= count; i++) {
				int rem = num % 10;
				if (rem % 2 == 0) {
					sum_even += rem;
				} else {
					sum_odd += rem;
				}
				num /= 10;
			}
			if ((sum_even % 4 == 0) || (sum_odd % 3 == 0))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

		s.close();
	}

}
