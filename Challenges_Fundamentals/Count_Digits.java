package Challenges_Fundamentals;

import java.util.*;

public class Count_Digits {

	private static int getCount(int num, int digit) {
		int count = 0;
		while (num > 0) {
			if (num % 10 == digit)
				count++;
			num /= 10;
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int digit = s.nextInt();
		System.out.println(getCount(num, digit));
		s.close();
	}
}