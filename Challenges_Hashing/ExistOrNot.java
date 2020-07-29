package Challenges_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class ExistOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			int q = s.nextInt();
			int[] querry = new int[q];
			for (int i = 0; i < q; i++) {
				querry[i] = s.nextInt();
			}
			checkArray(n, q, arr, querry);

			t--;
		}

		s.close();
	}

	private static void checkArray(int n, int q, int[] arr, int[] querry) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(arr[i], true);
		}

		for (int i = 0; i < q; i++) {
			if (map.containsKey(querry[i])) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
