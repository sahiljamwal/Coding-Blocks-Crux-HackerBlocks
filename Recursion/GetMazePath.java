package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * given a matrix get all possible paths to reach to end of the string from a
 * given cell in matrix. Allowed moves are only 1 Horizontal Move and 1 Vertical
 * Move.
 * 
 * @author sahil
 *
 */
public class GetMazePath {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Start coordinates: ");
		int startX = s.nextInt();
		int startY = s.nextInt();
		System.out.println("Enter End coordinates: ");
		int endX = s.nextInt();
		int endY = s.nextInt();
		System.out.println("Possible paths are: ");
		System.out.println(getMazePaths(startX, startY, endX, endY));

		s.close();
	}

	private static ArrayList<String> getMazePaths(int currentRow, int currentColumn, int endRow, int endColumn) {

		// positive base case : Reached destination
		if ((currentRow == endRow) && (currentColumn == endColumn)) {
			ArrayList<String> baseResult=new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}

		// negative base case: Crossed Boundary
		if ((currentRow > endRow) || (currentColumn > endColumn)) {
			ArrayList<String> baseResult=new ArrayList<String>();
			return baseResult;
		}

		// Recursion work
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recursionResultHorizontal = getMazePaths(currentRow, currentColumn + 1, endRow, endColumn);
		// attach H in front of each string in recursionResultHorizontal
		for (String str : recursionResultHorizontal) {
			myResult.add("H" + str);
		}

		ArrayList<String> recursionResultVertical = getMazePaths(currentRow + 1, currentColumn, endRow, endColumn);
		// attach V in front of each string in recursionResultVertical
		for (String str : recursionResultVertical) {
			myResult.add("V" + str);
		}

		return myResult;
	}

}
