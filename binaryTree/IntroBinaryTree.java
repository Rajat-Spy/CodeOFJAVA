package binaryTree;
import java.util.*;
public class IntroBinaryTree<E> {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node ans = createTree();
		inOrder(ans);
		System.out.println();
		preOrder(ans);
		System.out.println();
		postOrder(ans);
		System.out.println();
		Integer.ma
		
	}
	public static Node createTree() {
		Node root = null;
		System.out.println("Enter Data :   ");
		int n = sc.nextInt();
		if(n == -1) return null;
		root = new Node(n);
		System.out.println("Enter Left of "+n);
		root.left = createTree();
		System.out.println("Enter right of "+n);
		root.right = createTree();
		
		return root;
	}
	 static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

}

 class Node {
	 Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
