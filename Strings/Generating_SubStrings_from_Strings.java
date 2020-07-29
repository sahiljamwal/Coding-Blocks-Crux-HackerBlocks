package Strings;

public class Generating_SubStrings_from_Strings {

	public static void main(String[] args) {
		String str = "abcd";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
