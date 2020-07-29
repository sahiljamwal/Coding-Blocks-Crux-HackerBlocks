package Stack;

public class StackRunner {

	public static void main(String[] args) {
		Stack<Character> stack =new Stack<Character>();
		stack.push('a');
		stack.push('b');
		//stack.print();
		stack.pop();
		//stack.print();
		System.out.println(stack.size());
		System.out.println(stack.peek());
	}

}
