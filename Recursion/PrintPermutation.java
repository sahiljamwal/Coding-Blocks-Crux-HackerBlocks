package Recursion;

import java.util.Scanner;

/**
 * Given a String your task is to print all permutations of string using
 * recursion
 * 
 * @author sahil
 *
 */
public class PrintPermutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printPermutaions(str, "");
		s.close();
	}

	private static void printPermutaions(String question, String answer) {
		// Base Case
		if (question.length() == 0) {
			System.out.println(answer);
			return;
		}

		// for each character in string
		for (int i = 0; i < question.length(); i++) {
			char character = question.charAt(i);
			String remaingString = question.substring(0, i) + question.substring(i + 1);
			printPermutaions(remaingString, answer + character);
		}
	}

}
