package Recursion;

import java.util.Scanner;

/**
 * Print all the possible boardPaths from reaching current position to end
 * position with the help of a dice having 6 markers.
 * 
 * @author sahil
 *
 */
public class PrintBoardPath {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter starting number: ");
		int current = s.nextInt();
		System.out.println("Enter Ending Number: ");
		int end = s.nextInt();
		printBoardPath(current, end, "");

		s.close();
	}

	private static void printBoardPath(int current, int end, String ans) {
		// +ve base case
		if (current == end) {
			System.out.println(ans);
			return;
		}

		// -ve base case
		if (current > end) {
			return;
		}

		// recursion work
		for (int dice = 1; dice < 6; dice++) {
			printBoardPath(current + dice, end, ans + dice);
		}

	}

}
