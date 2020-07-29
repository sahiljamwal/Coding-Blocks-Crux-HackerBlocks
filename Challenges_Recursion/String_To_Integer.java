package Challenges_Recursion;

import java.util.Scanner;

//to convert string to integer using recursion
public class String_To_Integer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println(getInteger(str, 0, 0));

		s.close();
	}

	private static int getInteger(String str, int index, int ans) {
		// base case
		if (index == str.length())
			return ans;

		// my work
		ans += ((int) (str.charAt(index) - 48)) * (Math.pow(10, str.length() - 1 - index));

		// recursion
		return getInteger(str, index + 1, ans);
	}
}
