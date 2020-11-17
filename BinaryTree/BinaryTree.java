package BinaryTree;

import java.util.Scanner;

// implementation of Binary Tree
public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	public static Scanner scn = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		root = takeInput(null, true);
	}

	/**
	 * This method is internally used to construct the Binary Tree by the
	 * Constructor Method and return the address of the newly created node. Some
	 * terms used here with refrences
	 * ilc->isLeftChild,nn->newNode,hlc->hasLeftChild,hrc->hasRightChild
	 * 
	 * @param parent Node whose subtree is needed to be built
	 * @param ilc    true-> for left Child and false for Right child
	 * @return address of Node
	 */
	private Node takeInput(Node parent, boolean ilc) {
		// prompt
		if (parent == null) {
			System.out.println("Enter root node data: ");
		} else {
			if (ilc) {
				System.out.println("Enter left node data: ");
			} else {
				System.out.println("Enter right node data: ");
			}
		}

		// enter root node data
		int item = scn.nextInt();
		Node nn = new Node();
		// set data for root node
		nn.data = item;

		// prompt for left child node
		System.out.println("Do you want left child node of " + nn.data + " ?");
		boolean hlc = scn.nextBoolean();
		// recursively take input of left node
		if (hlc) {
			nn.left = takeInput(nn, true);
		}
		// prompt for left child node
		System.out.println("Do you want right child node of " + nn.data + " ?");
		boolean hrc = scn.nextBoolean();
		// recursively take input of left node
		if (hrc) {
			nn.right = takeInput(nn, false);
		}
		// return new node address
		return nn;
	}

	/**
	 * This method is provided to Client to access the display method for Binary
	 * Tree
	 */
	public void display() {
		display(root);
	}

	/**
	 * This method is used to print the tree in the fashion
	 * leftChild->RootNode<-RightChild
	 * 
	 * @param node the Parent Node Address whose subtree has to be printed
	 */
	private void display(Node node) {
		// base case
		if (node == null) {
			return;
		}
		// self work
		StringBuilder str = new StringBuilder();
		// check if leaf node
		if (node.left == null) {
			str.append("NULL-->");
		} else {
			str.append(node.left.data + "-->");
		}
		str.append(node.data);

		// check if leaf node
		if (node.right == null) {
			str.append("<--NULL");
		} else {
			str.append("<--" + node.right.data);
		}
		System.out.println(str);
		// smaller work -> Recursive Calls
		display(node.left);
		display(node.right);
	}

	/**
	 * This is client function to get the size or number of nodes present in the
	 * Binary Tree
	 * 
	 * @return size of the Binary Tree
	 */
	public int size() {
		return size(root);
	}

	/**
	 * This function to get the size or number of nodes present in the Binary Tree
	 * ls->LeftSize, rs->RightSize
	 * 
	 * @param node Accepts the Root node
	 * @return size of the Binary Tree
	 */
	private int size(Node node) {
		// base case
		if (node == null) {
			return 0;
		}
		// get size from left subtree
		int ls = size(node.left);
		// get size from right subtree
		int rs = size(node.right);

		// return size incrementing by 1 as Root node is also a node
		return ls + rs + 1;
	}

	/**
	 * This is client function to get the Maximum value of node present in the
	 * Binary Tree
	 * 
	 * @return max node value in the Binary Tree
	 */
	public int max() {
		return max(root);
	}

	/**
	 * This function is used to get the Maximum value of node present in the Binary
	 * Tree lm->leftMax, rm->rightMax
	 * 
	 * @param node Accepts the Root node
	 * @return max node value in the Binary Tree
	 */
	private int max(Node node) {
		// base case
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		// get max from left subtree
		int lm = max(node.left);
		// get max from left subtree
		int rm = max(node.right);

		// return max of both lm,rm and node data
		return Math.max(node.data, Math.max(lm, rm));
	}

	/**
	 * This is client function to find if a node is present in the Binary Tree
	 * 
	 * @param item accepts the item to be searched in Binary Tree
	 * @return true if item is present in BT or false otherwise
	 */
	public boolean find(int item) {
		return find(root, item);
	}

	/**
	 * This function is used to find if a node is present in the Binary Tree
	 * ls->leftSearch,rs->rightSearch
	 * 
	 * @param node Accepts the Root node
	 * @param item accepts the item to be searched in Binary Tree
	 * @return true if item is present in BT or false otherwise
	 */
	private boolean find(Node node, int item) {
		// base case
		if (node == null) {
			return false;
		}
		// if root node data is same as item
		if (node.data == item) {
			return true;
		}
		// if node is present in left Subtree
		boolean ls = find(node.left, item);
		// if node is present in right Subtree
		boolean rs = find(node.right, item);

		// return the result of ant of the search Result
		return ls || rs;
	}

	/**
	 * This is client function used to return the height of the Binary Tree.
	 * 
	 * @return height of the Binary Tree.
	 */
	public int height() {
		return height(root);
	}

	/**
	 * This function is used to return the height of the Binary Tree. Height is
	 * defined as the max distance from root to the leaf node. implementation may
	 * vary as some user prefer root height to be 0 while some prefer it to be 1
	 * 
	 * @param node Accepts the Root node
	 * @return height of the Binary Tree.
	 */
	private int height(Node node) {
		// base case-> may vary according to the standard being followed
		if (node == null) {
			return -1;
		}
		// max heght of left subTree
		int lh = height(node.left);
		// max heght of right subTree
		int rh = height(node.right);

		// return the height of tree by incrementing the value by 1 to the max heights
		// of both the subtrees
		return Math.max(lh, rh) + 1;
	}
}
