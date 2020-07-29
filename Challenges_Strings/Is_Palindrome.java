package Challenges_Strings;

import java.util.Scanner;

public class Is_Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num += arr[i] * Math.pow(10, n - i - 1);
		}
		System.out.println(isPalindrome(num));
		System.out.println(checkPalindromeRecursive(arr, 0, n - 1));

		s.close();
	}
	
	//Recursive approach
	private static boolean checkPalindromeRecursive(int[] arr, int left, int right) {
		//base case
		if (left >= right)
			return true;
		//self work
		if(arr[left] == arr[right])
			return checkPalindromeRecursive(arr, left+1, right-1);
		else
			return false;
	}
	
	//My Approach
	private static boolean isPalindrome(int num) {
		int count = (int) Math.log10(num) + 1;
		int n = num;
		int reverse = 0;
		for (int i = 0; i < count; i++) {
			int rem = num % 10;
			reverse += rem * Math.pow(10, count - i - 1);
			num /= 10;
		}

		if (n == reverse)
			return true;
		else
			return false;

	}

}
