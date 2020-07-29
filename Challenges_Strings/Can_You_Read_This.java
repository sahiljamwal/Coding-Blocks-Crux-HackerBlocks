package Challenges_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		printCamelCaseWords(str);
		printCamelCaseWordsOptimised(str);

		s.close();
	}

	// my approach
	private static void printCamelCaseWords(String str) {
		int n = str.length();
		ArrayList<Integer> indexes = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 90)
				indexes.add(i);
		}

		for (int i = 0; i < indexes.size(); i++) {
			if (i == indexes.size() - 1) {
				System.out.println(str.substring(indexes.get(i)));
			} else {
				System.out.println(str.substring(indexes.get(i), indexes.get(i + 1)));
			}

		}

	}

	// Optimized approach
	private static void printCamelCaseWordsOptimised(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			if (i != 0 && Character.isUpperCase(str.charAt(i)))
				System.out.println();

			System.out.print(str.charAt(i));
		}
	}

}
