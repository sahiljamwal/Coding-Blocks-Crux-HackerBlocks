package Recursion;

import java.util.Scanner;

public class Bubble_Sort {
//to implement bubble sort algorithm using recursion 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		dispaly(arr);
		bubbleSort(arr, 0, n - 1);
		dispaly(arr);

		s.close();
	}

	private static void dispaly(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void bubbleSort(int[] arr, int si, int ei) {
		// base case
		if (ei == 0)
			return;

		if (si == ei) {
			bubbleSort(arr, 0, ei - 1);
			return;
		}
		// my work
		if (arr[si] > arr[ei]) {
			int temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
		}
		// recursion
		bubbleSort(arr, si + 1, ei);

	}

}
