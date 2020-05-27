package Arrays;

import java.util.Scanner;

//used for efficient searching in a 2D array in O(m+n) complexity

public class Stair_Case_Search_Algorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int target = s.nextInt();

		System.out.println(matrixSearch(arr, target));

		s.close();
	}

	private static int matrixSearch(int[][] arr, int target) {

		int n = arr.length;
		int m = arr[0].length;
		int row = 0;
		int col = m - 1;

		while (row < n && col < m) {

			int currentElement = arr[row][col];

			if (currentElement == target) {
				return 1;
			} else if (currentElement > target) {
				col--;
			} else if (currentElement < target) {
				row++;
			}
		}

		return 0;
	}

}
