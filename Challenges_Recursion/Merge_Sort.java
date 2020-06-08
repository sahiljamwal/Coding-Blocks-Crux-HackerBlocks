package Challenges_Recursion;

import java.util.Scanner;

public class Merge_Sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		mergeSort(arr, 0, n - 1);
		display(arr);
		s.close();
	}

	private static void mergeSort(int[] arr, int start, int end) {
		// base Case
		if (start >= end)
			return;

		// my work
		int mid = (start + end) / 2;

		// recursion
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, end);

	}

	private static void merge(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		int[] ans = new int[end - start + 1];
		int i = start, j = mid + 1, index = 0;
		while ((i <= mid) && (j <= end)) {
			if (arr[i] < arr[j]) {
				ans[index++] = arr[i];
				i++;
			} else {
				ans[index++] = arr[j];
				j++;
			}
		}
		while (i <= mid) {
			ans[index++] = arr[i];
			i++;
		}

		while (j <= end) {
			ans[index++] = arr[j];
			j++;
		}
		// imp step
		for (int k = 0; k < ans.length; k++) {
			arr[start + k] = ans[k];
		}

	}

	private static void display(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (i != n - 1)
				System.out.print(arr[i] + " ");
			else
				System.out.print(arr[i]);
		}
	}

}
