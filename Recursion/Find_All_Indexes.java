package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_All_Indexes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int target = s.nextInt();

		int ans[] = getAllIndexes(arr, 0, target);

		display(ans);

		s.close();
	}

	private static void display(int[] ans) {
		for (int i : ans) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static int[] getAllIndexes(int[] arr, int si, int target) {
		ArrayList<Integer> indexes = new ArrayList<>();
		getAllIndexesHelper(arr, si, target, indexes);

		int ans[] = new int[indexes.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = indexes.get(i);
		}

		return ans;
	}

	private static void getAllIndexesHelper(int[] arr, int si, int target, ArrayList<Integer> indexes) {
		// base case
		if (si == arr.length)
			return;
		// my work
		if (arr[si] == target) {
			indexes.add(si);
		}

		// recursion
		getAllIndexesHelper(arr, si + 1, target, indexes);

	}

}
