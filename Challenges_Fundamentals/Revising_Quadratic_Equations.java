package Challenges_Fundamentals;

import java.util.*;

public class Revising_Quadratic_Equations {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		double D = Math.sqrt(((b * b) - (4 * a * c)));

		if (D == 0) {
			double r1 = ((-b) / (2.0 * a));
			System.out.println("Real and Equal");
			System.out.print((int) (r1) + " " + (int) (r1));
		} else if (D > 0) {
			double r1 = (((-b) - D) / (2.0 * a));
			double r2 = (((-b) + D) / (2.0 * a));
			System.out.println("Real and Distinct");
			System.out.print((int) (Math.min(r1, r2)) + " " + (int) (Math.max(r1, r2)));
		} else {
			System.out.print("Imaginary");
		}
		s.close();

	}
}
