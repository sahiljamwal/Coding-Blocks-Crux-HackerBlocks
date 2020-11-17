package BinaryTree;

/**
 * Client Class for Accessing the Binary Tree Test I/P String: 
 * 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
 * 
 * @author sahil
 *
 */
public class BinaryTreeClient {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.find(10));
		System.out.println(bt.size());
		System.out.println(bt.max());
		System.out.println(bt.height());
	}

}
