package Challenges_Recursion;

import java.util.Scanner;

public class Move_All_X_To_End {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(moveAllXtoEnd(str, 0, new StringBuilder(), new StringBuilder()));
		s.close();
	}

	private static StringBuilder moveAllXtoEnd(String str, int index, StringBuilder ans, StringBuilder ansX) {
		// base case
		if (index == str.length()) {
			ans.append(ansX);
			return ans;
		}

		// my work
		if (str.charAt(index) != 'x')
			ans.append(str.charAt(index));
		else
			ansX.append(str.charAt(index));

		// recursion work
		return moveAllXtoEnd(str, index + 1, ans, ansX);
	}

}
