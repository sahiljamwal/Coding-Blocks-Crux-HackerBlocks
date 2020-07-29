package Hashing;


public class LinkedList<T> {
	private class Node {
		T data;
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
	public void addLast(T item) {
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
	public void addFirst(T item) {

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
	public T getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list is empty");
		else
			return this.head.data;
	}

	// O(1) implementation of Get Last element function
	public T getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("Linked list is empty");
		else
			return this.tail.data;
	}

	// implementation of get data at index of LL
	public T getData(int index) throws Exception {
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
	public T removeFirst() throws Exception {
		T element;
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
	public T removeLast() throws Exception {
		T element;
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
	public T removeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}
		T element = getNode(index).data;

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
	
	public int find(T data) {
		int index=0;
		for(Node temp=this.head;temp!=null;temp=temp.next) {
			if(temp.data.equals(data)) {
				return index;
			}
			index++;
		}
		return -1;
	}

}
