package Hashing;

public class MapRunner {

	public static void main(String[] args) {
		Map<String, Integer> map = new Map<>();
		for (int i = 0; i < 20; i++) {
			map.put("abc" + i, 1 + i);
			System.out.println("i = " +  i + " lf = " + map.loadFactor());
		}
		
		map.remove("abc3");
		map.remove("abc7");
		
		for (int i = 0; i < 20; i++) {
			System.out.println("abc" + i + ":" + map.get("abc" + i));
		}
	}

}
