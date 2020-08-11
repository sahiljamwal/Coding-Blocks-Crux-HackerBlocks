package Challenges_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a recursive function which returns the count of subsequences for a
 * given string.
 * 
 * @author sahil
 *
 */
public class GetSubSequences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.next();
		System.out.println("Permutations of " + str + " are: ");
		printSubSequences(str);
		s.close();
	}

	private static void printSubSequences(String str) {
		ArrayList<String> list = printSubSequencesHelper(str);
		for (int index = 0; index < list.size(); index++) {
			System.out.print(list.get(index) + " ");
		}
		System.out.println();
		System.out.println(list.size());
	}

	private static ArrayList<String> printSubSequencesHelper(String str) {
		// base case
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		ArrayList<String> myAnswer = new ArrayList<String>();
		String ch = "" + str.charAt(0);
		ArrayList<String> recursionResult = printSubSequencesHelper(str.substring(1));
		myAnswer.addAll(recursionResult);
		for (String entry : recursionResult) {
			myAnswer.add(ch + entry);
		}
		return myAnswer;
	}

}
