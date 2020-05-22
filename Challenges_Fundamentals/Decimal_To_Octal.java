package Challenges_Fundamentals;

import java.util.Scanner;

public class Decimal_To_Octal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String ans = "";

		int divisor = 8;
		int divident = num;

		while (divident > 0) {
			int quo = divident / divisor;
			int rem = divident % divisor;
			ans += rem;
			divident = quo;
		}

		String octal = "";
		for (int i = ans.length() - 1; i >= 0; i--) {
			octal += ans.charAt(i);
		}
		System.out.println(octal);
		s.close();
	}

}
