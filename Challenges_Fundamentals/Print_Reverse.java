package Challenges_Fundamentals;

import java.util.*;

public class Print_Reverse {
	public static void main(String args[]) {
		// Your Code Here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int count = (int) Math.log10(n) + 1;

		int reverse = 0;

		for (int i = 1; i <= count; i++) {
			int rem = n % 10;
			reverse += rem * Math.pow(10, count - i);
			n /= 10;
		}
		System.out.println(reverse);
		s.close();
	}
}