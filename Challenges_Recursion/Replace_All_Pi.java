package Challenges_Recursion;

import java.util.Scanner;

//Replace all occurrences of pi with 3.14 recursively
public class Replace_All_Pi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String str = s.next();
			System.out.println(replacePi(str, 0, new StringBuilder()));
		}

		s.close();
	}

	private static StringBuilder replacePi(String str, int index, StringBuilder ans) {

		// base case
		if (index >= str.length())
			return ans;

		if (index == str.length() - 1) {
			ans.append(str.charAt(index));
			return ans;
		}

		// my work
		if (str.substring(index, index + 2).equals("pi")) {
			ans.append("3.14");
			index++;
		} else
			ans.append(str.charAt(index));

		// recursion
		return replacePi(str, index + 1, ans);

	}

}
