package Challenges_Fundamentals;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int t = 1; t <= n; t++) {
			long num = s.nextLong();
			int count = (int) (Math.log10(num) + 1);
			long ans = 0;
			for (int i = 0; i < count; i++) {
				long rem = num % 10;
				ans += rem * Math.pow(2,i);
				num /= 10;
			}

			System.out.println(ans);
		}
		s.close();
	}

}
