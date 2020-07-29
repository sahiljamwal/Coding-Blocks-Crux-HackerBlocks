package Challenges_Strings;

import java.util.Scanner;

public class Max_Frequency_Character {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		getMaxFrequency(str.toLowerCase());

		s.close();

	}

	private static void getMaxFrequency(String str) {
		int n = str.length();
		int[] freq = new int[26];
		for (int i = 0; i < n; i++) {
			freq[str.charAt(i) - 97]++;
		}
		int maxIndex = 0;
		for (int i = 0; i < 26; i++) {
			if (freq[i] > freq[maxIndex]) {
				maxIndex = i;
			}

		}

		System.out.print((char) (97 + maxIndex));
	}
}
