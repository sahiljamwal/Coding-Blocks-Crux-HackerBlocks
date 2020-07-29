package Challenges_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Pairs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int target = s.nextInt();
		printPairs(arr, target);
		s.close();
	}

	private static void printPairs(int[] arr, int target) {
		int n = arr.length;
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (j < n) {
					if (arr[i] + arr[j] == target) {
						System.out.println(arr[i]+" and "+arr[j]);
					}
				}
			}
		}

	}

}
