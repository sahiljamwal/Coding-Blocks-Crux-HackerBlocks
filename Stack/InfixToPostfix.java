package Stack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * To convert infix expression to postfix Expression supported operators are
 * {+,-,*,/}
 * 
 * @author sahil
 *
 */
public class InfixToPostfix {

	private static HashMap<String, Integer> priority;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(getPostfix(str));

		s.close();
	}

	/**
	 * 
	 * @param str - infix expression
	 * @return postfix- postfix expression
	 */
	private static StringBuilder getPostfix(String str) {
		fillHashMap();
		int n = str.length();
		StringBuilder postfix = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < n; i++) {
			String x = "" + str.charAt(i);
			if (Character.isLetterOrDigit(x.charAt(0))) {
				postfix.append(x);
			} else if ((x.equals("("))) {
				stack.push(x);
			} else if ((x.equals(")"))) {
				while ((!stack.isEmpty()) && (stack.peek() != "(")) {
					postfix.append(stack.pop());
				}
				if ((!stack.isEmpty()) && (stack.peek() == "(")) {
					stack.pop();
				} 
			} else {
				if (stack.isEmpty()) {
					stack.push(x);
				} else if (priority.get(x) > priority.get(stack.peek())) {
					stack.push(x);
				} else {
					while ((!stack.isEmpty()) && (priority.get(x) <= priority.get(stack.peek()))) {
						postfix.append(stack.pop());
					}
					stack.push(x);
				}
			}
		}
		while (!stack.isEmpty()) {
			if (stack.peek() != "(") {
				postfix.append(stack.pop());
			}
//			else {
//				return new StringBuilder("Invalid Expression");
//			}

		}

		return postfix.replace(postfix.indexOf("("),postfix.indexOf("(")+1 , "");
	}

	/**
	 * to initiate priority hashmap
	 */
	private static void fillHashMap() {
		priority = new HashMap<String, Integer>();
		priority.put("(", 0);
		priority.put("+", 1);
		priority.put("-", 1);
		priority.put("*", 2);
		priority.put("/", 2);
		priority.put("^", 3);

	}
}
