package Challenges_Arrays;

import java.util.Scanner;

public class Wave_Print_Column_Wise {

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

		wavePrint(arr);

		s.close();
	}

	private static void wavePrint(int[][] arr) {

		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] + ", ");
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					System.out.print(arr[j][i] + ", ");
				}
			}
		}
		System.out.println("END");
	}

}
