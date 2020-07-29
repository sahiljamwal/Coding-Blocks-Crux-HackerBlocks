package Challenges_Strings;

import java.util.Scanner;

public class Sanket_And_Strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		s.nextLine();
		String str = s.nextLine();

		getMaxPerfectness(str, k);

		s.close();
	}

	private static void getMaxPerfectness(String str, int k) {
		int n = str.length();
		int freqA = 0, freqB = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'a')
				freqA++;
			else
				freqB++;
		}

		int max = Math.max(freqA, freqB);

		if (k <= freqB)
			max += k;
		else
			max += freqB;

		System.out.println(max);
	}

}
