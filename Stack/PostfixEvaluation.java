package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * to evaluate postfix expression via stack supported operators are {+,-,/,*}
 * 
 * @author sahil
 *
 */
public class PostfixEvaluation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(evalPostfix(str));

		s.close();
	}

	/**
	 * 
	 * @param str the postfix string to be evaluated
	 * @return answer of the evaluation of postfix expression
	 * 
	 */
	private static int evalPostfix(String str) {
		Stack<String> stack = new Stack<String>();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			String x = ""+str.charAt(i);
			if ((x.equals("+")) || (x.equals("-")) || (x.equals("/")) || (x.equals("*"))) {
				int operand1 = Integer.parseInt(stack.pop());
				int operand2 = Integer.parseInt(stack.pop());
				int result = evaluate(operand1, operand2, x);
				stack.push(Integer.toString(result));
			} else {
				stack.push(x);
			}
		}

		return Integer.parseInt(stack.pop());
	}

	/**
	 * 
	 * @param operand1
	 * @param operand2
	 * @param operator
	 * @return result of computation
	 */
	private static int evaluate(int operand1, int operand2, String operator) {
		if (operator.equals("+")) {
			return (operand2 + operand1);
		} else if (operator.equals("-")) {
			return (operand2 - operand1);
		} else if (operator.equals("/")) {
			return (operand2 / operand1);
		} else {
			return (operand2 * operand1);
		}
	}

}
