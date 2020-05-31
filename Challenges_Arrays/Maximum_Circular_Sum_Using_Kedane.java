package Challenges_Arrays;

import java.util.Scanner;

//Using Kedane's Algorithm in O(n) complexity
public class Maximum_Circular_Sum_Using_Kedane {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int p = 0; p < t; p++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = s.nextInt();

			circularSum(arr);

		}

		s.close();
	}

	private static void circularSum(int arr[]) {
		int n = arr.length;
		int kadaneSum = kadaneAlgo(arr, n);
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += arr[i];
		}
		for (int i = 0; i < n; i++) {
			arr[i] = -1 * arr[i];
		}
		int flipArraySum = kadaneAlgo(arr, n);
		int maxSum = flipArraySum + totalSum;

		System.out.println(Math.max(kadaneSum, maxSum));

	}

	private static int kadaneAlgo(int arr[], int n) {

		int curSum = 0;
		int maxSum = 0;

		for (int i = 0; i < n; i++) {
			curSum += arr[i];
			if (curSum < 0) {
				curSum = 0;
			}
			maxSum = Math.max(curSum, maxSum);
		}

		return maxSum;
	}

}
