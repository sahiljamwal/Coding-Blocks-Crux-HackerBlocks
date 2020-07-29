package Challenges_Linked_List;

import java.util.Scanner;

class LinkedList {

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

	public int kNode(int k) {
		
		if(head == null || k<0)
			return -1;
		
		Node t1=head,t2=head;
		for(int i=0;i<k;i++) {
			if(t1 == null)
				return -1;
			t1=t1.next;
		}
		
		while(t1 != null) {
			t1=t1.next;
			t2=t2.next;
		}
		
		return t2.data;
	}
}

public class Kth_Node_From_end {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList list = new LinkedList();
		while (s.hasNext()) {
			int num = s.nextInt();
			if (num != -1)
				list.addLast(num);
			else
				break;
		}
		int k = s.nextInt();
		System.out.println(list.kNode(k));

		s.close();
	}


}
