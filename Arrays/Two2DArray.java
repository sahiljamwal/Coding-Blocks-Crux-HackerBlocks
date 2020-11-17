package Arrays;

import java.util.Scanner;

public class Two2DArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[][] = takeInput();

		display(arr);

	}

	private static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] takeInput() {

		System.out.println("Enter no. of rows :");
		int rows = s.nextInt();
		int arr[][] = new int[rows][];

		for (int row = 0; row < rows; row++) {
			System.out.println("Enter no. of columns for row " + (row + 1) + " :");
			int cols = s.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.println("Enter the element for row " + (row + 1) + " and column " + (col + 1) + " :");
				arr[row][col] = s.nextInt();
			}
		}
		return arr;

	}

}
