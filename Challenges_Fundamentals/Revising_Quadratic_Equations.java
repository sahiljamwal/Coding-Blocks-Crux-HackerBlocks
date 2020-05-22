package Challenges_Fundamentals;

import java.util.*;

public class Revising_Quadratic_Equations {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int D = (int) Math.sqrt(((b * b) - (4 * a * c)));

		if (D == 0) {
			int r1 = ((-b) / (2 * a));
			System.out.println("Real and Equal");
			System.out.println(r1 + " " + r1);
		} else if (D > 0) {
			int r1 = (((-b) - D) / (2 * a));
			int r2 = (((-b) + D) / (2 * a));
			System.out.println("Real and Distinct");
			if (r1 < r2)
				System.out.println(r1 + " " + r2);
			else
				System.out.println(r2 + " " + r1);
		} else {
			System.out.println("Imaginary");
		}
		s.close();

	}
}
