package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

//to check if pairs of parenthesis are balanced
public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println("Parenthesis are balanced :" + checkBalance(str));

		s.close();
	}

	private static boolean checkBalance(String str) {
		int n = str.length();
		if (n == 0) {
			return true;
		}

		if (n % 2 != 0) {
			return false;
		}

		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if ((ch == '{') || (ch == '[') || (ch == '(')) {
				stack.push(ch);
			} else {
				if ((stack.isEmpty()) || (ch == '}') && (stack.peek() != '{')) {
					return false;
				} else if ((stack.isEmpty()) || (ch == ']') && (stack.peek() != '[')) {
					return false;
				} else if ((stack.isEmpty()) || (ch == ')') && (stack.peek() != '(')) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();

	}

}
