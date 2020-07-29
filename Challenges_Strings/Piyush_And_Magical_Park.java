package Challenges_Strings;

import java.util.Scanner;

public class Piyush_And_Magical_Park {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int m = s.nextInt();
		char arr[][] = new char[n][m];
		int K = s.nextInt();
		int S = s.nextInt();
		takeInput(arr, n, m);

		piyushMagicalPark(arr, n, m, K, S);

		s.close();
	}

	private static void piyushMagicalPark(char[][] arr, int n, int m, int minimumStength, int strength) {
		boolean isLost = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (strength >= minimumStength) {
					if (arr[i][j] == '.')
						strength -= 2;
					else if (arr[i][j] == '*')
						strength += 5;
					else if (arr[i][j] == '#')
						break;

					if (j != m - 1)
						strength--;
				} else {
					isLost = true;
					break;
				}
			}
			if (isLost)
				break;
		}
		if (isLost) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			System.out.println(strength);
		}
	}

	private static void takeInput(char[][] arr, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.next().charAt(0);
			}
		}
	}

}
