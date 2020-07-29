package Challenges_Strings;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		compressString(str);

		s.close();
	}

	private static void compressString(String str) {
		int n = str.length();
		int index = 0;
		StringBuilder ans = new StringBuilder("");
		while (index < n) {
			char ch = str.charAt(index);
			int i = index + 1;
			int count = 1;
			while (i < n) {
				if (str.charAt(i) != ch)
					break;
				count++;
				i++;
			}
			ans.append(ch);
			ans.append(count);
			index = i;
		}
		System.out.println(ans);
	}

}
