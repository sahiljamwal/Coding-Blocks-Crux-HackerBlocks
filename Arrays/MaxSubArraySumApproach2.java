package Arrays;

import java.util.Scanner;

//this is an O(n^2) approach and use a pre-computation array storing cumulative sum

public class MaxSubArraySumApproach2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		generateMaxSum(arr);

		s.close();
	}

	private static void generateMaxSum(int[] arr) {
		int n = arr.length;
		int currentSum = 0, maxSum = 0;
		int left = -1, right = -1;
		int[] cummulativeSum = new int[n];
		cummulativeSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			cummulativeSum[i] = cummulativeSum[i - 1] + arr[i];
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {

				currentSum = 0;

				if (i > 0)
					currentSum = cummulativeSum[j] - cummulativeSum[i - 1];
				else
					currentSum = cummulativeSum[j];

				if (currentSum > maxSum) {
					maxSum = currentSum;
					left = i;
					right = j;
				}
			}
		}

		System.out.println("Max sum is " + maxSum);
		System.out.println("Elemnts of array:");

		for (int i = left; i <= right; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

}
