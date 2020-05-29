package Challenges_Strings;

import java.util.Scanner;

public class Difference_In_ASCII_Codes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		genrateDifference(str);

		s.close();
	}

	private static void genrateDifference(String str) {
		StringBuilder sb = new StringBuilder();
		int n = str.length();

		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				int asciDiff = (int) str.charAt(i + 1) - (int) str.charAt(i);
				sb.append(str.charAt(i));
				sb.append(asciDiff);
			} else {
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb);
	}

}
