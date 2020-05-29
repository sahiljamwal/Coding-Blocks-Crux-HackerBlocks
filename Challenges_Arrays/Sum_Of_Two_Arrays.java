package Challenges_Arrays;

import java.util.Scanner;

public class Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int m = s.nextInt();
		int b[] = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = s.nextInt();
		}

		sumArrays(a, b);

		s.close();
	}

	private static void sumArrays(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int size;
		if (n > m)
			size = n + 1;
		else
			size = m + 1;
		int ans[] = new int[size];
		int index = size - 1, i = n - 1, j = m - 1;
		int carry = 0, sum = 0;

		while (i >= 0 && j >= 0) {
			sum = a[i--] + b[j--] + carry;
			if (sum > 9)
				carry = sum / 10;
			else
				carry = 0;

			ans[index--] = sum % 10;
		}

		sum = 0;

		if (i < 0) {
			while (j >= 0) {
				sum = b[j--] + carry;
				if (sum > 9)
					carry = sum / 10;
				else
					carry = 0;
				ans[index--] = sum % 10;
			}

		} else if (j < 0) {

			while (i >= 0) {
				sum = a[i--] + carry;
				if (sum > 9)
					carry = sum / 10;
				else
					carry = 0;
				ans[index--] = sum % 10;
			}

		}

		ans[index] = carry;

		if (ans[0] != 0)
			System.out.print(ans[0] + ", ");
		for (index = 1; index < size; index++) {
			System.out.print(ans[index] + ", ");
		}
		System.out.println("END");

	}

}
