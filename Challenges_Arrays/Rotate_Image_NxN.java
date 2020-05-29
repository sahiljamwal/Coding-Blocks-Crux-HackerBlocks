package Challenges_Arrays;

import java.util.Scanner;

public class Rotate_Image_NxN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = m;
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		rotateArray(arr);
		rotateArray(arr, n);
		display(arr);

		s.close();
	}

	private static void rotateArray(int[][] arr, int n) {
		transposeArray(arr, n);
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length / 2; i++) {

				int temp = arr[i][j];
				arr[i][j] = arr[arr.length - i - 1][j];
				arr[arr.length - i - 1][j] = temp;
			}
		}
	}

	private static void transposeArray(int[][] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;
			}
		}
	}

	private static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (col == arr[row].length - 1)
					System.out.print(arr[row][col]);
				else
					System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

	private static void rotateArray(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int data[] = new int[rows * cols];
		int index = 0;

		for (int col = cols - 1; col >= 0; col--) {
			for (int row = 0; row < rows; row++) {
				data[index++] = arr[row][col];
			}
		}

		index = 0;

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				arr[row][col] = data[index++];
			}
		}
	}

}
