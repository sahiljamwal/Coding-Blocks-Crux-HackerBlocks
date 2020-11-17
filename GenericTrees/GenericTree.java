package GenericTrees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private static Node root;

	public GenericTree() {
		root = construct(null, -1);
	}

	/**
	 * 
	 * @param parent the node whose subtree is to be constructed
	 * @param ith    the index number of the ith child to be created
	 * @return the address of the newly created node
	 */
	private Node construct(Node parent, int ith) {

		// prompt
		if (parent == null) {
			System.out.println("Enter the data for root child ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data + " ?");
		}

		// take input of data
		int item = scn.nextInt();

		// create new Node
		Node newNode = new Node();

		// update the new Node
		newNode.data = item;

		// prompt
		System.out.println("Enter number of children of " + newNode.data + " ?");

		// take input of number of children
		int numberOfChildren = scn.nextInt();

		// iterate over the number of children
		for (int index = 0; index < numberOfChildren; index++) {
			Node child = construct(newNode, index);
			newNode.children.add(child);
		}

		// return the address of newly created node
		return newNode;
	}

}
