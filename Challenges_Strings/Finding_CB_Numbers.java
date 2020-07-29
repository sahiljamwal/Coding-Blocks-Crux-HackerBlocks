package Challenges_Strings;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();

		findCBNumbers(str, n);

		s.close();
	}

	private static void findCBNumbers(String str, int n) {
		int count = 0;
		StringBuilder ans = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String subString = str.substring(i, j);
				if (checkPrime(Long.parseLong(subString))) {
					if (ans.length() == 0 || ans.indexOf(subString) == -1) {
						ans.append(subString);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean checkPrime(long n) {

		if (n == 0 || n == 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		else {
			for (int i = 3; i * i <= n; i += 2) {
				if (n % i == 0)
					return false;
			}
		}

		return true;
	}

}
