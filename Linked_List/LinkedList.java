package Linked_List;

//implementation of Linked List Data Structure
public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(n) display method for Linked List
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// to implement addToLast Method of Linked List
	public void addLast(int item) {
		// create node
		Node node = new Node();
		node.data = item;
		node.next = null;

		// append to list
		if (this.size >= 1) {
			this.tail.next = node;
		}

		// update summary object
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.tail = node;
			this.size++;
		}
	}

	// to implement add to First Method of Linked List
	public void addFirst(int item) {

		// create node
		Node node = new Node();
		node.data = item;
		node.next = null;

		// attach
		if (this.size >= 1) {
			node.next = head;
		}

		// append node and update summary object
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.head = node;
			this.size++;
		}
	}

	// O(1) implementation of Get first element function
	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list is empty");
		else
			return this.head.data;
	}

	// O(1) implementation of Get Last element function
	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list is empty");
		else
			return this.tail.data;
	}

	// implementation of get data at index of LL
	public int getData(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (index < 0 || index >= size) {
			throw new Exception("Invalid index");
		}

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	// implementation of get node at index of LL
	private Node getNode(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (index < 0 || index >= size) {
			throw new Exception("Invalid index");
		}

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp;
	}

	// to implement remove first method for LL
	public int removeFirst() throws Exception {
		int element;
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		element = head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return element;
	}

	// to implement remove first method for LL
	public int removeLast() throws Exception {
		int element;
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		element = tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.tail = this.getNode(size - 2);
			this.tail.next = null;
			this.size--;
		}

		return element;
	}

	// to implement remove node at any index
	public int removeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}
		int element = getNode(index).data;

		if (index == 0)
			return removeFirst();
		else if (index == this.size - 1)
			return removeLast();
		else {
			Node before = getNode(index - 1);
			before.next = getNode(index).next;
			this.size--;
		}

		return element;
	}

	// to implement reverseLL by reversing data in a linked list
	public void reverseList() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			Node l = getNode(left);
			Node r = getNode(right);

			int temp = l.data;
			l.data = r.data;
			r.data = temp;

			left++;
			right--;
		}
	}

	// to implement reverseLL by reversing pointers
	public void reversePointers() {

		if (this.size == 0)
			return;

		Node prev = this.head;
		Node current = prev.next;

		while (current != null) {
			Node ahead = current.next;
			current.next = prev;

			prev = current;
			current = ahead;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}

	// to find the mid point node's data of Linked List in One traversal only
	public int getMidData() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}
