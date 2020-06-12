package Challenges_Recursion;

import java.util.Scanner;

//to implement Quick Sort
class Pivot {
	// this class is just created for simplifying the approach and algorithm can be implemented
	// even without it
	int left;
	int right;
}

public class Quick_Sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		quickSort(arr, 0, n - 1);
		display(arr);
		s.close();

	}

	private static void quickSort(int[] arr, int low, int high) {

		// base case
		if (low >= high)
			return;

		// my work
		Pivot pivot = getPivot(arr, low, high);

		// recursion work
		quickSort(arr, low, pivot.left);
		quickSort(arr, pivot.right, high);
	}

	private static Pivot getPivot(int[] arr, int low, int high) {

		Pivot pivotElement = new Pivot();

		int left = low;
		int right = high;

		int mid = (left + right) / 2;
		int pivot = arr[mid];

		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		pivotElement.left = right;
		pivotElement.right = left;

		return pivotElement;
	}

	private static void display(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
