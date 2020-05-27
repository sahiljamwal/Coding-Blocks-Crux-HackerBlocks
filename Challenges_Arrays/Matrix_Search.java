package Challenges_Arrays;

import java.util.Scanner;

//uses Linear Search O(n^2)

public class Matrix_Search {

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

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					return 1;
				}

			}
		}

		return 0;
	}

}
