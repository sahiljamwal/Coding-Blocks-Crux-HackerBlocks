package Recursion;

import java.util.Scanner;

//to return the first index of occurrence of data in array using recursion
public class First_Index {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int data = s.nextInt();

		System.out.println("first Index of data is " + getFirstIndex(arr, 0, data));

		s.close();
	}

	private static int getFirstIndex(int[] arr, int si, int data) {
		// base case
		if (si == arr.length)
			return -1;

		// my work
		if (arr[si] == data)
			return si;

		// recursion work
		return getFirstIndex(arr, si + 1, data);
	}

}
