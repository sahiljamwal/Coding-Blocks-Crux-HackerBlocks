package Linked_List;

//to test the Linked List class
public class LinkedListRunner {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.display();
		list.reverseList();
		list.display();
		list.reversePointers();
		list.display();
		System.out.println(list.getMidData());
	}

}
