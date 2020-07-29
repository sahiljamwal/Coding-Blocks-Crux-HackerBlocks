package Recursion;

import java.util.Scanner;

//to check if the given array is sorted recursively
public class Is_Array_Sorted {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		 System.out.println("is Sorted " + isSorted(arr, 0));

		s.close();
	}

	private static boolean isSorted(int[] arr, int si) {

		// base case
		if (si == arr.length - 1) {
			return true;
		}

		// my work
		if (arr[si] > arr[si + 1])
			return false;

		// recursion
		return isSorted(arr, si + 1);
	}

}
