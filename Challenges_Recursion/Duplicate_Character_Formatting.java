package Challenges_Recursion;

import java.util.Scanner;

//to format duplicate characters in string recursively
public class Duplicate_Character_Formatting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println(formatString(str, 0, new StringBuilder()));

		s.close();
	}

	private static StringBuilder formatString(String str, int index, StringBuilder ans) {
		// base case
		if (index == str.length() - 1) {
			ans.append(str.charAt(index));
			return ans;
		}

		// my work
		if (str.charAt(index) == str.charAt(index + 1)) {
			ans.append(str.charAt(index));
			ans.append("*");
		} else {
			ans.append(str.charAt(index));
		}

		// recursion work
		return formatString(str, index + 1, ans);
	}

}
