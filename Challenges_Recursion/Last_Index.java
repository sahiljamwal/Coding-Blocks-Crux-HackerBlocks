package Challenges_Recursion;

import java.util.Scanner;

//to return the last index of occurrence of data in array using recursion
public class Last_Index {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int data = s.nextInt();

		System.out.println(getLastIndex(arr, 0, data));

		s.close();
	}

	private static int getLastIndex(int[] arr, int si, int data) {
		// base case
		if (si == arr.length)
			return -1;

		// recursion work
		int index = getLastIndex(arr, si + 1, data);

		// my work
		if (index == -1) {
			if (arr[si] == data)
				return si;
			else
				return -1;
		} else {
			return index;
		}

	}

}
