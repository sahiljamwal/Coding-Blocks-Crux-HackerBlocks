package Stack;

import java.util.ArrayDeque;

/***
 * Operations discussed push,pop,peek,size
 * Use Stack for thread safety implementation
 * for coding purpose use ArrayDeque to avoid extra overhead
 * @author sahil
 *
 */
public class StackFromCollection {

	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(10);
		stack.push(20);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.peek());
	}

}
