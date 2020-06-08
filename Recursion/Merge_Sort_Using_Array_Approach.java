package Recursion;

import java.util.Scanner;

//implementing merge sort using Array approach
public class Merge_Sort_Using_Array_Approach {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int[] ans = mergeSort(arr, 0, n - 1);
		display(ans);
		s.close();
	}

	private static int[] mergeSort(int[] arr, int low, int high) {
		// base case
		if (low >= high) {
			int baseArray[] = new int[1];
			baseArray[0] = arr[low];
			return baseArray;
		}

		int mid = (low + high) / 2;
		// recursion work
		int firstHalf[] = mergeSort(arr, low, mid);
		int secondHalf[] = mergeSort(arr, mid + 1, high);
		// my work
		int merged[] = merge(firstHalf, secondHalf);

		return merged;
	}

	private static int[] merge(int[] firstHalf, int[] secondHalf) {

		int m = firstHalf.length;
		int n = secondHalf.length;

		int merged[] = new int[m + n];
		int i = 0, j = 0, index = 0;

		while (i < m && j < n) {
			if (firstHalf[i] <= secondHalf[j]) {
				merged[index++] = firstHalf[i++];
			} else {
				merged[index++] = secondHalf[j++];
			}
		}

		if (i == m) {
			while (j < n) {
				merged[index++] = secondHalf[j++];
			}
		}

		if (j == n) {
			while (i < m) {
				merged[index++] = firstHalf[i++];
			}
		}

		return merged;
	}

	private static void display(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
