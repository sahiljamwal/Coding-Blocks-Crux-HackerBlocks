package Challenges_Strings;

import java.util.Scanner;

public class Ultra_Fast_Mathematician {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int p = 0; p < t; p++) {
			String str1 = s.next();
			String str2 = s.next();
			String str3 = "";
			int n = str1.length();
			for (int i = 0; i < n; i++) {
				int char1 = str1.charAt(i);
				int char2 = str2.charAt(i);
				str3 += (char1 != char2) ? "1" : "0";
			}
			System.out.println(str3);
		}

		s.close();
	}

}
