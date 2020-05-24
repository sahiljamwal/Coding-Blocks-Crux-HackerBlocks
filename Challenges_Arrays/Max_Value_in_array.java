package Challenges_Arrays;

import java.util.Scanner;

public class Max_Value_in_array {

	private static int getMax(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println(getMax(arr));
		s.close();
	}

}
