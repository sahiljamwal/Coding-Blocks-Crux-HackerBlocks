package Arrays;

//by using kedane's algorithm in O(n)

public class Max_SubArray_Sum_Approach_3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -3, -6, 5, -2 };
		generateMaxSum(arr);
	}

	private static void generateMaxSum(int[] arr) {
		int n = arr.length;
		int currentSum = 0, maxSum = 0;

		for (int i = 0; i < n; i++) {
			currentSum += arr[i];
			
			if (currentSum < 0)
				currentSum = 0;
			
			maxSum = Math.max(currentSum, maxSum);
		}

		System.out.println("Max sum is " + maxSum);

	}
}
