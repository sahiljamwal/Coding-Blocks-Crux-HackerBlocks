package Challenges_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequency {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		printMax(n, arr);

		s.close();
	}

	private static void printMax(int n, int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int maxF = -1, max = -1;

		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) > maxF) {
				max = arr[i];
				maxF = map.get(arr[i]);
			}
		}

		System.out.println(max);
	}

}
