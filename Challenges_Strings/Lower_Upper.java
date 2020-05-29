package Challenges_Strings;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.nextLine().charAt(0);

		checkCase(ch);
		s.close();

	}

	private static void checkCase(char ch) {

		if (ch >= 65 && ch <= 90)
			System.out.print("UPPERCASE");
		else if (ch >= 97 && ch <= 122)
			System.out.print("lowercase");
		else
			System.out.print("Invalid");

	}

}
