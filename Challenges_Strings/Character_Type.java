package Challenges_Strings;

import java.util.Scanner;

public class Character_Type {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.nextLine().charAt(0);

		checkCase(ch);
		s.close();

	}

	private static void checkCase(char ch) {

		if (ch >= 'a' && ch <= 'z')
			System.out.print("L");
		else if (ch >= 'A' && ch <= 'Z')
			System.out.print("U");
		else
			System.out.print("I");

	}
}
