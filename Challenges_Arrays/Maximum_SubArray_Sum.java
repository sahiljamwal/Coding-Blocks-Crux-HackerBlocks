package Challenges_Arrays;

import java.util.Scanner;

//using kedane's Algorithm
public class Maximum_SubArray_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int p = 0; p < t; p++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(getMaxSum(arr));
		}

		s.close();
	}

	private static long getMaxSum(int[] arr) {
		int n = arr.length;
		long currentMaximum = arr[0];
		long maximumSoFar = arr[0];
		for (int i = 1; i < n; i++) {
			currentMaximum = Math.max(arr[i], currentMaximum + arr[i]);
			maximumSoFar = Math.max(currentMaximum, maximumSoFar);
		}

		return maximumSoFar;
	}

}
