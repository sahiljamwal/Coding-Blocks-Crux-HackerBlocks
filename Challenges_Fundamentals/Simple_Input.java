package Challenges_Fundamentals;

import java.util.*;

public class Simple_Input {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int n = s.nextInt();
		while (s.hasNextInt()) {

			sum += n;
			if (sum >= 0)
				System.out.println(n);

			n = s.nextInt();
		}
		s.close();

	}
}