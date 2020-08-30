package Stack;

//Stack implementation using Linked Lists
public class StackMain<T> {
	private class Node<K> {
		K data;
		Node<K> next;

		Node(K data) {
			this.data = data;
			this.next = null;
		}
	}

	// Stack global data
	private int size;
	private Node<T> head;

	// Stack Constructor
	public StackMain() {
		this.size = 0;
		this.head = null;
	}

	// push method to insert data to stack top
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			head.next = null;
		}
		node.next = head;
		head = node;
		this.size++;
	}

	// pop method to pop data from top of stack
	public void pop() {
		if (size == 0) {
			throw new Error("No data to pop.");
		}
		head = head.next;
		this.size--;
	}

	// size method to return stack size
	public int size() {
		return this.size;
	}

	// peek method to get the the element on top
	public T peek() {
		if (head == null) {
			throw new Error("No data in Stack.");
		}
		return head.data;
	}

}
