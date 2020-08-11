package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author sahil we have board of length n, and a dice whose faces numbered from
 *         1 to 6. initailly we are at starting point of board. so we have to
 *         print the no of ways to reach destination.
 *
 */
public class Print_Board_Path {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(getBoardPath(0, n).size());
		s.close();

	}

	private static ArrayList<String> getBoardPath(int current, int end) {

		// positve base case
		if (current == end) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		// negative base cases
		else if (current > end) {
			ArrayList<String> baseResult = new ArrayList<String>();
			return baseResult;
		}

		ArrayList<String> myResult = new ArrayList<String>();
		for (int dice = 1; dice <= 6; dice++) {
			// Recursion work
			ArrayList<String> recursionResult = getBoardPath(current + dice, end);

			// My work
			for (String str : recursionResult) {
				myResult.add(dice + str);
			}
		}

		return myResult;
	}

}
