package Hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapWorkingInternal {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("USA", 1000);
		map.put("India", 2000);
		map.put("Russia", 3000);
		System.out.println(map.size());
		System.out.println(map.remove("USA"));
		System.out.println("++++++++KEYSET+++++++++");

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("++++++++VALUESET+++++++++");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println("++++++++KEY/VALUE/SET+++++++++");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

	}

}
