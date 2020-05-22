package Challenges_Fundamentals;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int term;
		int i = 1;
		while (n1 != 0) {
			term = 3 * i + 2;
			if (term % n2 != 0) {
				System.out.println(term);
				n1--;
			}
			i++;
		}

		s.close();
	}

}
