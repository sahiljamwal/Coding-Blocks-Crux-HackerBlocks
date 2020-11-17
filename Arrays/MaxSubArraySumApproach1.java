package Arrays;

import java.util.Scanner;

//this is brute force  and is O(n^3) approach

public class MaxSubArraySumApproach1 {

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

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				currentSum = 0;
				for (int k = i; k <= j; k++) {
					currentSum += arr[k];
				}
				if (currentSum > maxSum) {
					maxSum = currentSum;
					left = i;
					right = j;
				}
			}
		}
		
		System.out.println("Max sum is "+maxSum);
		System.out.println("Elemnts of array:");
		
		for(int i=left;i<=right;i++)
			System.out.print(arr[i]+" ");
		System.out.println();

	}

}
