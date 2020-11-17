package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Rotate array by k clockwise if k is positve and anticlockwise by k if k is negative
 */
public class RotateArrayByK {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		rotate(a, k-1);
		display(a);
		br.close();
	}

	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	public static void rotate(int[] arr, int k) {
		// write your code here
		
	}

}
