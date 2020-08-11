package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

// to get permutations of a string using recursion
public class Get_Permutations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(getPermutaions(str));
		s.close();
	}

	private static ArrayList<String> getPermutaions(String str) {

		// base case
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add(" ");
			return baseResult;
		}

		char ch = str.charAt(0);
		ArrayList<String> recursionResult = getPermutaions(str.substring(1));
		ArrayList<String> myResult = new ArrayList<String>();
		// iterate over recursion result and add the character in every possible
		// position
		for (String string : recursionResult) {
			for (int index = 0; index < string.length(); index++) {
				String permutation = string.substring(0, index) + ch + string.substring(index);
				myResult.add(permutation);
			}
		}

		return myResult;

	}

}
