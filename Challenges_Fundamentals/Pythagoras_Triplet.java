package Challenges_Fundamentals;

import java.util.Scanner;

public class Pythagoras_Triplet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		printTriplets(num);
		s.close();

	}

	private static void printTriplets(int num) {
		int m, n, side, hypotenuse;
		if (num == 1 || num == 2) {
			System.out.println("-1");
		} else if (num % 2 == 0) {
			m = num / 2;
			n = 1;
			side = (m * m - n * n);
			hypotenuse = (m * m + n * n);
			if (side * side + num * num != hypotenuse * hypotenuse)
				System.out.println("-1");
			else
				System.out.println(side + " " + hypotenuse);
		} else {
			m = (num + 1) / 2;
			n = (num - 1) / 2;
			side = (2 * m * n);
			hypotenuse = (m * m + n * n);
			if (side * side + num * num != hypotenuse * hypotenuse)
				System.out.println("-1");
			else
				System.out.println(side + " " + hypotenuse);
		}
	}

}
