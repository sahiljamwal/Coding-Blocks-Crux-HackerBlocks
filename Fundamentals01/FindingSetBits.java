package Fundamentals01;

import java.util.Scanner;

//to find the setbits i.e no of 1's in binary representation of n using BITWISE Operators

public class FindingSetBits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		getSetBits(n);
		s.close();
	}

	/*
	 * do AND operation with 1 until n>0 and n is right shifted each time increment
	 * counter as result of AND Operation
	 */
	private static void getSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += (n & 1);
			n = n >> 1;
		}
		System.out.println(count);
	}
}
