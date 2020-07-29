package Challenges_Arrays;

import java.util.Scanner;

public class Median_Of_Sorted_Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			b[i] = s.nextInt();
		}

		mergeArrays(a, b);

		s.close();
	}

	private static void mergeArrays(int[] a, int[] b) {
		int n = a.length;
		int index1 = 0, index2 = 0;
		int[] arr = new int[2 * n];
		int index = 0;

		while (index1 < n && index2 < n) {

			if (a[index1] < b[index2]) {
				arr[index++] = a[index1];
				index1++;
			} else {
				arr[index++] = b[index2];
				index2++;
			}

		}
		if (index1 == n) {
			while (index2 < n) {
				arr[index++] = b[index2];
				index2++;
			}
		} else {
			while (index1 < n) {
				arr[index++] = a[index1];
				index1++;
			}
		}

		System.out.println(arr[(arr.length-1)/2]);
	}

}
