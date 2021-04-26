package binaryTree;
import java.util.*;
public class IntroBinaryTree<E> {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node ans = createTree();
		System.out.println(ans);
		
	}
	public static Node createTree() {
		System.out.println("Enter Data :   ");
		int n = sc.nextInt();
		if(n == -1) return null;
		Node root = new Node(n);
		System.out.println("Enter Left of "+n);
		Node left = createTree();
		System.out.println("Enter right of "+n);
		Node right = createTree();
		
		return root;
		
	}
	

}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
