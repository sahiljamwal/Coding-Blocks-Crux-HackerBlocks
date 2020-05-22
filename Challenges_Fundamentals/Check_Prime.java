package Challenges_Fundamentals;

import java.util.*;

public class Check_Prime {

	private static String checkPrime(int num) {
		if (num == 1)
			return "Not Prime";
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return "Not Prime";

		}
		return "Prime";
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkPrime(n));
		s.close();
	}
}