package Challenges_Recursion;

import java.util.Scanner;

//to delete consecutive characters from string recursively 
public class Remove_Duplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder ans = new StringBuilder();
		ans.append(str.charAt(0));
		System.out.println(removeDuplicate(str, 1, ans));

		s.close();
	}

	private static StringBuilder removeDuplicate(String str, int index, StringBuilder ans) {

		// base work
		if (index >= str.length())
			return ans;

		// my work
		if (str.charAt(index) != ans.charAt(ans.length() - 1))
			ans.append(str.charAt(index));

		// recursion work
		return removeDuplicate(str, index + 1, ans);
	}

}
