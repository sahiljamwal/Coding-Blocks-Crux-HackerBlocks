package Recursion;

import java.util.Scanner;

/**
 * given a matrix print all possible paths to reach to end of the string from a
 * given cell in matrix. Allowed moves are only 1 Horizontal Move and 1 Vertical
 * Move and 1 Diagonal Move.
 * 
 * @author sahil
 *
 */
public class PrintMazePathDiagonal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Start coordinates: ");
		int startX = s.nextInt();
		int startY = s.nextInt();
		System.out.println("Enter End coordinates: ");
		int endX = s.nextInt();
		int endY = s.nextInt();
		System.out.println("Possible paths are: ");
		printMazePathsDiagonal(startX, startY, endX, endY, "");

		s.close();
	}

	private static void printMazePathsDiagonal(int currentRow, int currentColumn, int endRow, int endColumn,
			String ans) {

		// positive base case : Reached destination
		if ((currentRow == endRow) && (currentColumn == endColumn)) {
			System.out.println(ans);
			return;
		}

		// negative base case: Crossed Boundary
		if ((currentRow > endRow) || (currentColumn > endColumn)) {
			return;
		}

		// Recursion work for Horizontal, Vertical and Diagonal direction
		printMazePathsDiagonal(currentRow, currentColumn + 1, endRow, endColumn, ans + "H");
		printMazePathsDiagonal(currentRow + 1, currentColumn, endRow, endColumn, ans + "V");
		printMazePathsDiagonal(currentRow + 1, currentColumn + 1, endRow, endColumn, ans + "D");
	}

}
