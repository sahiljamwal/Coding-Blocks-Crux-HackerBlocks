package Fundamentals01;

import java.util.Scanner;

//to check if number is odd/even?
public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		s.close();
	}

}
