package Challenges_Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ArraysIntersectionOf2Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = s.nextInt();
		}

		ArrayList<Integer> ans = getList(n, a, b);

		System.out.println(ans);

		s.close();
	}

	private static ArrayList<Integer> getList(int n, int[] a, int[] b) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		for (int i = 0; i < n; i++) {
			if (map.containsKey(b[i])) {
				int value = map.get(b[i]);
				if (value - 1 == 0) {
					map.remove(b[i]);
				} else {
					map.put(b[i], value - 1);
				}
				list.add(b[i]);
			}
		}

		Collections.sort(list);
		return list;
	}

}
