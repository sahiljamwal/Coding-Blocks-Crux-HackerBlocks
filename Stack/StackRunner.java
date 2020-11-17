package Stack;

public class StackRunner {

	public static void main(String[] args) {
		StackMain<Character> stack =new StackMain<Character>();
		stack.push('a');
		stack.push('b');
		//stack.print();
		stack.pop();
		//stack.print();
		System.out.println(stack.size());
		System.out.println(stack.peek());
	}

}
