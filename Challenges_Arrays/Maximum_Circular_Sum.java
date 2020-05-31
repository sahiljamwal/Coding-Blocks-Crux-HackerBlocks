package Challenges_Arrays;

import java.util.Scanner;

//complexity O(n^2)
public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int p = 0; p < t; p++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = s.nextInt();

			calculateMaxCircularSum(arr);

		}

		s.close();
	}

	private static void calculateMaxCircularSum(int[] arr) {
		int n = arr.length;
		long cs = 0;// current sum
		long ms = 0;// max sum
		int index = -1, counter = 0; // to store the index of element evaluated
		int i = 0;
		while (i < n) {
			if (counter == 0)
				index = i;
			cs += arr[i];
			if (cs < 0)
				cs = 0;
			ms = Math.max(cs, ms);
			i++;
			if (i == n)
				i = 0;// for circular array
			counter++;
			if (counter == n) {
				counter = 0;
				i = index + 1;
				cs = 0;
			}
		}
		System.out.println(ms);
	}

}
