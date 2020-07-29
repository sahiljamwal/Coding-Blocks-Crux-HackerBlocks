package Challenges_Arrays;

import java.util.Scanner;

public class Spiral_Print_AntiClockWise {

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
		spiralPrint(arr);

		s.close();
	}

	private static void spiralPrint(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[top].length - 1;
		int count = (bottom + 1) * (right + 1);
		int dir = 1;

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					dir = 2;
					left++;
				}
			}

			if (count > 0) {
				if (dir == 2) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					dir = 3;
					bottom--;
				}
			}

			if (count > 0) {
				if (dir == 3) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					dir = 4;
					right--;
				}
			}

			if (count > 0) {
				if (dir == 4) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
					dir = 1;
					top++;
				}
			}

		}
		System.out.println("END");
	}

}
